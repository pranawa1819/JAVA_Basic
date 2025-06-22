package GUIControls;

import javax.swing.*;

public class ScrollPannel {

    public static void main(String[] args) {
        JFrame frame= new JFrame("ScrollPane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,200);

        JTextArea textArea = new JTextArea(10,20);
        JScrollPane scrollPane =new JScrollPane(textArea);
        frame.add(scrollPane);
        frame.setVisible(true);
    }
}
