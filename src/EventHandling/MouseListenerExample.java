package EventHandling;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

public class MouseListenerExample extends JFrame implements MouseListener {
    JLabel label;
   public MouseListenerExample(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Mouse Listener Example");
        setSize(500,500);
        setLayout(null);
        setVisible(true);

        label = new JLabel();
        label.setBounds(0,0,300,300);
        label.setBackground(Color.RED);
        label.setOpaque(true);//now the background will be painted aand visible
        add(label);//add the label to the frame
        label.addMouseListener(this);
   }

    @Override
    public void mouseClicked(MouseEvent e) {
       //
        System.out.println("You clicked the mouse");
        label.setBackground(Color.GREEN);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //
       System.out.println("You Released the mouse");
        label.setBackground(Color.PINK);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // invoked when the mouse button has been clicked or pressed on a component
        System.out.println("You pressed the mouse");
        label.setBackground(Color.BLUE);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //
        System.out.println("You entered the mouse");
        label.setBackground(Color.GRAY);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("You exit the mouse");
        label.setBackground(Color.RED);
    }

    public static void main(String[] args) {

       new MouseListenerExample();
    }




}
