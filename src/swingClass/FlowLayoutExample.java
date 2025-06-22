package swingClass;
import javax.swing.*;
import java.awt.*;
public class FlowLayoutExample {

    public static void main(String[] args) {
        JFrame jframe = new JFrame();
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(400,500);

        jframe.setLayout(new FlowLayout(FlowLayout.CENTER));

        jframe.add(new JButton("Login"));
        jframe.add(new JButton("SignIn"));
        jframe.add(new JButton("SignUp"));

        JLabel label1 = new JLabel("I love Mendak");
        jframe.add(label1);
        jframe.setVisible(true);



    }
}
