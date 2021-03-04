package HomeWork14;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

    public static void main(String[] args) {
        Socket socket = null;
        try (ServerSocket serverSocket = new ServerSocket(8189)) {
            System.out.println("Сервер запущен, ожидаем подключения...");
            socket = serverSocket.accept();
            System.out.println("Клиент подключился");
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                String str = in.readUTF();
                System.out.println(str);
                if (str.equals("/end")) {
                    break;
                }
                
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            while (true) {
                                String name = reader.readLine();
                                out.writeUTF("Serv: " + name);
                                if (name.equalsIgnoreCase("/end")) {
                                    break;
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
