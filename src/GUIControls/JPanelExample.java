package GUIControls;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class JPanelExample extends JFrame implements ActionListener{
  JPanel jp1, jp2;
  JButton b1,b2;

  public JPanelExample(){
      setSize(600,600);
      setLayout(null); //  will not use any layout
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setTitle("How to make Panel");
      setLocationRelativeTo(null);// is used to center a window
      setResizable(false);  // prevent the user from resizing the window
      setExtendedState(MAXIMIZED_BOTH); //JFrame.ICONIFIED - means "minimized // opens the output in full screen


      jp1 = new JPanel();
      add(jp1).setBounds(100,100,400,400);
      jp1.setBackground(Color.CYAN);
      jp1.setLayout(null);

      jp2 = new JPanel();
      add(jp2).setBounds(550,100,400,400);
      jp2.setBackground(Color.PINK);
      jp2.setLayout(null);
      jp2.hide();

      b1 = new JButton("Login");
      jp1.add(b1).setBounds(10,10,100,30);

      b2 = new JButton("Login");
      jp2.add(b2).setBounds(10,10,100,30);

      b1.addActionListener(this);
      b2.addActionListener(this);
  }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            jp2.show();
            jp1.hide();
        }
        if(e.getSource()==b2){
            jp1.show();
            jp2.hide();
        }

    }

    public static void main(String[] args) {
        new JPanelExample();
    }
}
