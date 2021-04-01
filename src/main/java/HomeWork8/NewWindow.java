package HomeWork8;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class NewWindow extends JFrame {
    public NewWindow() {

        setTitle("Your chat window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(200, 200, 600, 600);
        setVisible(true);

        JPanel mainPanel = new JPanel();

        mainPanel.setLayout(new BorderLayout());

        JTextField field = new JTextField();
        JTextArea chatArea = new JTextArea();

        chatArea.setEditable(false);
        chatArea.setColumns(20);
        chatArea.setRows(5);
        chatArea.setLineWrap(true);
        chatArea.setText("Say hello then answer." +  "\n");
        chatArea.setWrapStyleWord(true);
        chatArea.setCaretPosition(chatArea.getDocument().getLength());

        mainPanel.add(field, BorderLayout.SOUTH);
        mainPanel.add(chatArea, BorderLayout.CENTER);

        JScrollPane sp = new JScrollPane(chatArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        mainPanel.add(sp);

        field.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String t = e.getActionCommand();
                chatArea.append("YOU --> " + t + "\n");
                chatArea.setCaretPosition(chatArea.getDocument().getLength());
                String answer = botAnswer(t);
                chatArea.append("CPU --> " + answer + "\n");
                chatArea.setCaretPosition(chatArea.getDocument().getLength());
                field.setText("");

            }
        });

        chatArea.setBackground(Color.LIGHT_GRAY);

        add(mainPanel);
        setVisible(true);
    }

    String botAnswer(String myMessage){
            try {
                Thread.sleep(700);
            } catch (Exception e){}

            if (myMessage.contains("hey") || myMessage.contains("hello")){
                return "hey man";
            }

            Random rd = new Random();
            int num = rd.nextInt(4);
            if (num == 0){
                return "sup bro";
            } else if (num == 1){
                return "yeah";
            } else if (num == 2){
                return "no i dont think so";
            } else if (num == 3){
                return "probably, good luck!";
            } else {
                return "sorry i dont know i'am just a program!";
            }
    }
}
