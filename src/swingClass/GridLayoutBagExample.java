package swingClass;

import javax.swing.*;
import java.awt.*;

public class GridLayoutBagExample {
    public static void main(String[] args) {
        JFrame jframe = new JFrame();
        jframe.setLayout(new GridBagLayout());
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(300,400);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill=GridBagConstraints.HORIZONTAL;
        // gbc.fill=GridBagConstraints.Both;// fill both vertical and horizontal

        //button 1 at (1,0)
        gbc.gridx = 1;
        gbc.gridy = 0;
        jframe.add(new JButton("hello"));

        //button 2 at (0,0)
        gbc.gridx = 0;
        gbc.gridy = 0;
        jframe.add(new JButton("hi"));

        //button 3 at (0,1) with internal padding
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.ipady = 10;
        jframe.add(new JButton("Bye"));
        jframe.setVisible(true);

    }
}
