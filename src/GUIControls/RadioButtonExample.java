package GUIControls;
import javax.swing.*;

public class RadioButtonExample extends JFrame{
    JRadioButton male,female;
    ButtonGroup bg;
    public RadioButtonExample(){
        setSize(600,600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Radio");
        setLocationRelativeTo(null);//is used to center a window
        setResizable(false);//Prevents the users from resizing the window.
        //setExtendedState(MAXIMIZED_BOTH);

        //Create a make radio button
        male = new JRadioButton("Male");
        add(male).setBounds(200,200,100,30);
        //Creates a female radio button
        female = new JRadioButton("Female");
        add(female).setBounds(300,200,100,30);

        bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
    }

    public static void main(String[] args) {
        new RadioButtonExample();
    }
}
