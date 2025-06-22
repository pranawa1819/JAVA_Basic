package swingClass;
import javax.swing.*;

public class FrameSwingFirst {
    public static void main(String[] args) {
        JFrame j= new JFrame();
      //  j.setTitle("Example");
       // j.setSize(500,300);
      //  j.setLocation(250,300);
        j.setBounds(500,300,200,200);
        j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);// IT AUTOMATICALLY END THE TASK
        j.setVisible(true);

        JButton login = new JButton("Login");
        login.setBounds(40, 40,70,30 );
        j.add(login);
        j.setLayout(null);
        j.setVisible(true);

        JTextField tx= new JTextField();
        tx.setBounds(40,80,100,30);
        j.add(tx);

        JLabel label = new JLabel("Name");
        label.setBounds(40,100,250,30);
        j.add(label);
    }
}
