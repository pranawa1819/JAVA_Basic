package EventHandling;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public  class WindowListenerExample extends JFrame implements WindowListener {
    private JLabel statusLabel;

    public WindowListenerExample(){
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setTitle("Window Listener Example");
        setSize(500,500);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);

        // add a status to show current window state

        statusLabel = new JLabel("Windows status: Ready");
        statusLabel.setBounds(20,20,460,30);
        statusLabel.setFont(new Font("Ariel",Font.BOLD,16));
        add(statusLabel);

        this.addWindowListener(this);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Window Opened");
        statusLabel.setText("Window status: Opened");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Window Closed");
        statusLabel.setText("Window status: Closed");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Window closing");
        int choice = JOptionPane.showConfirmDialog(this,"Are you sure you want to exit?","Exit Configuration",JOptionPane.YES_NO_OPTION);
        if(choice == JOptionPane.YES_OPTION){
            System.out.println("Window is Closed");
            dispose();
            System.exit(0);
        }
        else{
            statusLabel.setText("Window status: Close cancelled");
        }
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Window minimized");
        statusLabel.setText("Window status: Minimized");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window restored");
        statusLabel.setText("Window status: Restored");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Window Activated");
        statusLabel.setText("Window status: Activate");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window Deactivate");
        statusLabel.setText("Window status: Deactivated");
    }

    public static void main(String[] args) {
        new WindowListenerExample();
    }
}
