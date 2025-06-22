package EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class MouseAdapterExample extends MouseAdapter {
     JFrame frame;

    public MouseAdapterExample(){
        frame =new JFrame("Mouse adapter example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        // register this mouse adapter as the listener
        frame.addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Graphics g = frame.getGraphics();
        g.setColor(Color.YELLOW);
        g.fillOval(e.getX(),e.getY(),50,50);

    }


    public static void main(String[] args) {
        new MouseAdapterExample();
    }
}
