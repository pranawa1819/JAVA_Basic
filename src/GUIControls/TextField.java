package GUIControls;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextField extends JFrame  implements  ActionListener {

    JTextField txt1, txt2;
    JLabel num1,num2,result;
    JButton sum;
    public TextField(){

        setSize(600, 600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("TextField and JLabel");
        setLocationRelativeTo(null);
        setResizable(false);

        num1 = new JLabel("First number");
        add(num1).setBounds(100,100,150,30);
        //num1.setFont(new font("Serif",Font.BOLD|Font.ITALIC,14)
        txt1 = new JTextField();
        add(txt1).setBounds(300,100,100,30);

        num2 = new JLabel("Second number");
        add(num2).setBounds(100,150,150,30);

        txt2 = new JTextField();
        add(txt2).setBounds(300,150,100,30);

        result = new JLabel("Result");
        add(result).setBounds(300,200,100,30);

        sum = new JButton("Sum");
        add(sum).setBounds(300,250,100,30);
        sum.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==sum){
           // if(e.getSource()==sum){
              //  if(e.getSource()==sum){
                    try{
                        //try parsing input values
                        double a = Double.parseDouble(txt1.getText());
                        double b = Double.parseDouble(txt2.getText());
                       // txt1.setText("");
                       // txt2.setText("");//show result
                        result.setText("Result: "+(a+b));
                        //JOptionPane.showMessageDialog(null,"Sum is:(a+b);

                    }
                    catch(NumberFormatException ex){
                        //clear result only if input is invalid
                        result.setText("");
                        //show error message
                        JOptionPane.showMessageDialog(null,"Please enter valid number");
                    }
               // }
            //}
        }
    }

    public static void main(String[] args) {
       try{
           UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
           UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
           UIManager.put("Label.font",new Font("SansSerif",Font.BOLD | Font.ITALIC,14));
           UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");

       }
       catch(Exception e){
           e.printStackTrace();
       }
        new TextField();
    }
}
