package EventHandling;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class KeyListenerExample extends JFrame implements KeyListener {

    JLabel label;
    ImageIcon icon;
    int x =0, y = 0;

    public KeyListenerExample(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Mouse Listener Example");
        setSize(500,500);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.BLACK);

        // label and scale the image

        ImageIcon originalIcon = new ImageIcon("C:/Users/LENOVO/Desktop/JavaClasswork/image/rocket.png");
        Image img = originalIcon.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
        icon = new ImageIcon(img);

        label = new JLabel();
        label.setBounds(x,y,100,100);
        label.setIcon(icon);


        this.add(label);
        this.addKeyListener(this);
        this.setFocusable(true);


    }

    @Override
    public void keyTyped(KeyEvent e) {
        // keytyped = invoked when a key is typed uses keychar, char output
        // detects ryping a unicode character (like letters), opnly character, producing key(a-z, A-Z, 1-9)

        switch(e.getKeyChar()){
            case 'a':
                label.setLocation(label.getX()-10,label.getY());
                break;

            case 'w':
                label.setLocation(label.getX(),label.getY()-10);
                break;

            case 's':
                label.setLocation(label.getX(),label.getY()+10);
                break;

            case 'd':
                label.setLocation(label.getX()+10,label.getY());
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //keypressed= invoked when a physical key is pressed down uses keychar, int output
        //detects physical key press (any key). All key (eg: arrows, shift, ctrl)

        switch(e.getKeyCode()){
            case 37:
                label.setLocation(label.getX()-10,label.getY());
                break;
            case 38:
                label.setLocation(label.getX(),label.getY()-10);
                break;

            case 39:
                label.setLocation(label.getX()+10,label.getY());
                break;
            case 40:
                label.setLocation(label.getX(),label.getY()+10);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("You released key char: "+e.getKeyChar());
        System.out.println("You released key code: "+e.getKeyCode());
    }

    public static void main(String[] args) {
        new KeyListenerExample();
    }
}
