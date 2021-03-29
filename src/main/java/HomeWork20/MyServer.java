package HomeWork20;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class MyServer implements ReadWriteFile {

    private final int PORT = 8081;

    private List<ClientHandler> clients;
    private AuthService authService;

    private File file = new File("D:\\java\\test.txt");

    public AuthService getAuthService() {
        return authService;
    }

    public MyServer() {
        try (ServerSocket server = new ServerSocket(PORT)) {
            authService = new BaseAuthService();
            authService.start();
            clients = new ArrayList<>();
            if(file.exists()){
                file.delete();
                file.createNewFile();
            }
            while (true) {
                System.out.println("Сервер ожидает подключения");
                Socket socket = server.accept();
                System.out.println("Клиент подключился");
                new ClientHandler(this, socket);
            }
        } catch (IOException e) {
            System.out.println("Ошибка в работе сервера");
        } finally {
            if (authService != null) {
                authService.stop();
            }
        }
    }

    public synchronized boolean isNickBusy(String nick) {
        for (ClientHandler o : clients) {
            if (o.getName().equals(nick)) {
                return true;
            }
        }
        return false;
    }

    public synchronized void broadcastMsg(String msg) throws IOException {
        for (ClientHandler o : clients) {
            o.sendMsg(msg);
        }

        // запись сообщения в файл
        writeToFile(msg);
    }

    public synchronized void unsubscribe(ClientHandler o) {
        clients.remove(o);
    }

    public synchronized void subscribe(ClientHandler o) {
        clients.add(o);
    }


    @Override
    public synchronized String readFile() throws IOException {

        FileInputStream in = new FileInputStream(file);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String strLine = null, tmp;
        List<String> lines = new LinkedList<String>();
        while ((tmp = br.readLine()) != null) {
            if (lines.add(tmp) && lines.size() > 5)
                lines.remove(0);
        }

        lines.remove(lines.size()-1);

        String lastLine = strLine;
        System.out.println(lastLine);
        in.close();

        StringBuilder s = new StringBuilder();
        for (String str: lines) {
            s.append(str+'\n');
        }
        return s.toString();

    }


    @Override
    public synchronized void writeToFile(String msg) throws IOException {

        // Создание файла
        if (!(file.exists())) {
            file.createNewFile();
        }

        try {
            // Создание объекта FileWriter
            FileWriter writer = new FileWriter(file, true);

            // Запись содержимого в файл
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write(msg + "\n");
            bufferWriter.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
