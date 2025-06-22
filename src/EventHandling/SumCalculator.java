package EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SumCalculator extends JFrame {
    private JTextField tf1, tf2;
    private JLabel resultLabel;

    public SumCalculator() {
        setTitle("Sum Calculator");
        setSize(400, 300);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Font font = new Font("Arial", Font.PLAIN, 14);

        JLabel label1 = new JLabel("Enter first number: ");
        label1.setBounds(20, 20, 80, 25);
        add(label1);

        tf1 = new JTextField();
        tf1.setBounds(200, 20, 100, 25);
        add(tf1);

        JLabel label2 = new JLabel("Enter second number: ");
        label2.setBounds(20, 50, 80, 25);
        add(label2);

        tf2 = new JTextField();
        tf2.setBounds(200, 50, 100, 25);
        add(tf2);

        resultLabel = new JLabel("Result will appear here!");
        resultLabel.setBounds(20, 85, 300, 25);
        add(resultLabel);

        this.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                calculateSum();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                calculateDifference();
            }
        });
        setVisible(true);
    }
    public void calculateSum(){
        try{
            int num1 = Integer.parseInt(tf1.getText().trim());
            int num2 = Integer.parseInt(tf2.getText().trim());
            int sum = num1+num2;
            resultLabel.setText(String.format("Sum: "+sum));
        }catch(NumberFormatException e){
            resultLabel.setText("Please Enter valid integers!!");
        }
    }

    public void calculateDifference(){
        try{
            int num1 = Integer.parseInt(tf1.getText().trim());
            int num2 = Integer.parseInt(tf2.getText().trim());
            int difference = num1-num2;
            resultLabel.setText(String.format("Difference: "+difference));
        }catch(NumberFormatException e){
            resultLabel.setText("Please Enter valid integers!!");
        }
    }

    public static void main(String[] args) {
        new SumCalculator();
    }
}
