package EventHandling;
import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
public class FocusListenerExample extends JFrame implements FocusListener {

    JTextField t1;
    JTextArea TA;

    public FocusListenerExample(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Focus Listener Example");
        setSize(500,500);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);

        //create and add JTextfield

        t1 = new JTextField("Click to edit me");
        t1.setBounds(50,50,200,30);
        t1.addFocusListener(this);
        add(t1);

        TA = new JTextArea("Click to write here.....");
        TA.setBounds(50,100,300,200);
        TA.addFocusListener(this);
        add(TA);
    }

    @Override
    public void focusGained(FocusEvent e) {
        if(e.getSource()==t1){
            System.out.println("TextField gained focus");
            t1.setBackground(Color.ORANGE);
        }
        else if(e.getSource()==TA){
            System.out.println("TextArea gained focus");
            TA.setBackground(Color.pink);
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (e.getSource() == t1) {
            System.out.println("TextField lost focus");
            t1.setBackground(Color.WHITE);
        } else if (e.getSource() == TA) {
            System.out.println("TextArea lost focus");
            TA.setBackground(Color.WHITE);
        }
    }
    public static void main(String[] args) {
        new FocusListenerExample();
    }


}
