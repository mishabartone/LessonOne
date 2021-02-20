package Lectures.LectureEightPack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyWindow extends JFrame {
    public MyWindow () {
        setTitle("My First Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(200, 200, 600, 600);
        setVisible(true);

//        JButton button1 = new JButton("1");
//        JButton button2 = new JButton("2");
//        JButton button3 = new JButton("3");
//        JButton button4 = new JButton("4");
//        JButton button5 = new JButton("5");


        JPanel mainPanel = new JPanel();

//        mainPanel.setLayout(new GridLayout(5, 5));
//
//        JButton [] arr = new JButton[20];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = new JButton("" + i);
//            mainPanel.add(arr[i]);
//        }
//        Label label = new Label();

//        add(mainPanel);

        mainPanel.setLayout(new BorderLayout());

        JPanel firstButtonPanel = new JPanel();
//        button1.setSize(new Dimension(20, 50));
//        firstButtonPanel.add(button1);
//        button2.setSize(20, 50);

        JTextField field = new JTextField();
        JTextField field2 = new JTextField();
        field2.setEnabled(false);
//        field.setSize(50, 50);

        mainPanel.add(field, BorderLayout.SOUTH);
        mainPanel.add(field2, BorderLayout.CENTER);

        String text = "";

        field.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(field.getText());
                field2.setText(field.getText() + "\n");
                field.setText("");
//                text = text.concat(field.getText());

            }
        });

//        field.addKeyListener(keyListener);
//        firstButtonPanel.add(field);
//
//        mainPanel.add(firstButtonPanel, BorderLayout.EAST);
//        mainPanel.add(button2, BorderLayout.WEST);
//        mainPanel.add(button3, BorderLayout.NORTH);
//        mainPanel.add(button4, BorderLayout.SOUTH);
//        mainPanel.add(button5, BorderLayout.CENTER);

//        button5.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println(e.getActionCommand());
//                System.out.println(e.paramString());
//                firstButtonPanel.setBackground(new Color(255, 0, 255));
//            }
//        });

//        button5.addMouseListener(new MouseListener() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                if (e.getButton() == 1){
//                    button5.setBackground(Color.blue);
//                } else if (e.getButton() == 2) {
//                    button5.setBackground(Color.red);
//                } else if (e.getButton() == 3) {
//                    button5.setBackground(Color.green);
//                }
//            }
//
//            @Override
//            public void mousePressed(MouseEvent e) {
//
//            }
//
//            @Override
//            public void mouseReleased(MouseEvent e) {
//                System.out.println("asd");
//            }
//
//            @Override
//            public void mouseEntered(MouseEvent e) {
//
//            }
//
//            @Override
//            public void mouseExited(MouseEvent e) {
//                System.out.println("poka");
//            }
//        });

//        button5.addKeyListener(new KeyListener() {
//            @Override
//            public void keyTyped(KeyEvent e) {
//                if (e.getKeyChar() == 'b'){
//                    button5.setBackground(Color.blue);
//                } else if (e.getKeyChar() == 'r') {
//                    button5.setBackground(Color.red);
//                } else if (e.getKeyChar() == 'g') {
//                    button5.setBackground(Color.green);
//                }
//            }
//
//            @Override
//            public void keyPressed(KeyEvent e) {
//
//            }
//
//            @Override
//            public void keyReleased(KeyEvent e) {
//
//            }
//        });

        firstButtonPanel.setBackground(new Color(15, 240, 240));

        add(mainPanel);

        setVisible(true);
    }

//    KeyListener keyListener = new KeyListener() {
//        @Override
//        public void keyTyped(KeyEvent e) {
//
//        }
//
//        @Override
//        public void keyPressed(KeyEvent e) {
//            if (e.getExtendedKeyCode() == 18 && e.getKeyChar() == 'c'){
//                System.out.println("cg");
//            }
//        }
//
//        @Override
//        public void keyReleased(KeyEvent e) {
//
//        }
//    };
}
