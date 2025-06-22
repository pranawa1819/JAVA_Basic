package EventHandling;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventExample extends JFrame implements ActionListener {

    JButton b1;
    JTextField textfield;


    public ActionEventExample(){
        setTitle("TextField + Button");
        setSize(400,200);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //create test field
        textfield = new JTextField();
        textfield.setBounds(50,40,200,30);
        textfield.addActionListener(this);

        //create button
        b1 = new JButton("Submit");
        b1.setBounds(260,40,80,30);
        b1.addActionListener(this);

        // add components
        add(textfield);
        add(b1);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String input = textfield.getText().trim();//trim to ignore spaces

        if(e.getSource()==b1){
            if(input.isEmpty()){
                JOptionPane.showMessageDialog(this,"Text field is empty","Warning",JOptionPane.WARNING_MESSAGE);

            }
            else{
                JOptionPane.showMessageDialog(this,"Button clicked! Text: "+ input);
            }

        }
        else if(e.getSource()==textfield){
            JOptionPane.showMessageDialog(this,"Enter Pressed! Text: "+ input);
        }
    }

    public static void main(String[] args) {
        new ActionEventExample();
    }
}

