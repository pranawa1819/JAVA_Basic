package EventHandling;

import javax.swing.*;
import java.awt.event.WindowAdapter;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowAdapterExample extends JFrame {

    public WindowAdapterExample() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Window Adapter Example");
        setSize(500, 500);
        setLayout(null);
        setVisible(true);
        setResizable(false);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                JOptionPane.showMessageDialog(null, "Window Opened");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                JOptionPane.showMessageDialog(null, "Window Closed");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("Window Closed");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("Window Minimized");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("Window Restored");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("Window Activated");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("Window Deactivated");
            }
        });

    }

    public static void main(String[] args) {
        new WindowAdapterExample();
    }

}
