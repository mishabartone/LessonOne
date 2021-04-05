package HomeWork19.clients;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Calendar;
import java.util.Date;


public class firstEchoClient extends JFrame  {

    private final static String IP_ADDRESS = "localhost"; //127.0.0.1 ip address
    private final static int SERVER_PORT = 8081;

    private JTextField msgInputField;
    private JTextArea chatArea;

    String nickname;

    private Socket socket;
    private DataInputStream dis;
    private DataOutputStream dos;

    private boolean isAuthorized;

    public firstEchoClient() {
        try {
            connection();
        } catch (IOException ignored) {
            ignored.printStackTrace();
        }
        prepareGUI();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new firstEchoClient();
        });
    }

    public boolean isAuthorized() {
        return isAuthorized;
    }

    public void setAuthorized(boolean authorized) {
        isAuthorized = authorized;
    }

    private void connection() throws IOException {
        socket = new Socket(IP_ADDRESS, SERVER_PORT);
        dis = new DataInputStream(socket.getInputStream());
        dos = new DataOutputStream(socket.getOutputStream());
        setAuthorized(false);
        Thread thread = new Thread(() -> {
            try {

                while (true) {

                    String serverMessage = dis.readUTF();
                    if (serverMessage.startsWith("/authok")) {
                        setAuthorized(true);
                        nickname = serverMessage.substring(8);
                        chatArea.append(serverMessage + "\n");
                        break;
                    }
                    chatArea.append(serverMessage + "\n");
                }
                while (isAuthorized) {
                    String serverMessage = dis.readUTF();
                    chatArea.append(serverMessage + "\n");
                }
            } catch (IOException ignored) {
                ignored.printStackTrace();
            }
            closeConnection();
        });
        thread.start();
    }

    private void sendMessageToServer() {
        if (!msgInputField.getText().trim().isEmpty()) {
            try {
                String messageToServer = msgInputField.getText();
                dos.writeUTF(messageToServer);
                msgInputField.setText("");
            } catch (IOException ignored) {
            }
        }
    }

    private void prepareGUI() {

        setBounds(600, 300, 500, 500);
        setTitle("Клиент");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        chatArea = new JTextArea();
        chatArea.setEditable(false);
        chatArea.setLineWrap(true);
        add(new JScrollPane(chatArea), BorderLayout.CENTER);


        JPanel bottomPanel = new JPanel(new BorderLayout());
        JButton btnSendMsg = new JButton("Отправить");
        bottomPanel.add(btnSendMsg, BorderLayout.EAST);
        msgInputField = new JTextField();
        add(bottomPanel, BorderLayout.SOUTH);
        bottomPanel.add(msgInputField, BorderLayout.CENTER);

        btnSendMsg.addActionListener(e -> {
            sendMessageToServer();
        });

        msgInputField.addActionListener(e -> {
            sendMessageToServer();
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                try {
                    dos.writeUTF("/q");
                } catch (IOException ignored) {
                }
            }
        });

        setVisible(true);
    }

    private void closeConnection() {

        try {
            dos.flush();
        } catch (IOException ignored) {
        }

        try {
            dis.close();
        } catch (IOException ignored) {
        }

        try {
            dos.close();
        } catch (IOException ignored) {
        }

        try {
            socket.close();
        } catch (IOException ignored) {
        }
    }
}
