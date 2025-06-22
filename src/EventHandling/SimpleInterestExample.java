package EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleInterestExample extends JFrame implements ActionListener {
    JLabel lblPrincipal, lblTime, lblRate, lblResult;
    JTextField txtPrincipal, txtTime, txtRate, txtResult;
    JButton btnCalculate;

    public SimpleInterestExample() {
        setTitle("Simple Interest Calculator");
        setSize(400, 300);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Font font = new Font("Arial", Font.PLAIN, 14);

        // Principal
        lblPrincipal = new JLabel("Principal (P):");
        lblPrincipal.setBounds(30, 30, 120, 25);
        lblPrincipal.setFont(font);
        add(lblPrincipal);

        txtPrincipal = new JTextField();
        txtPrincipal.setBounds(160, 30, 180, 25);
        txtPrincipal.setFont(font);
        add(txtPrincipal);

        // Time
        lblTime = new JLabel("Time (T):");
        lblTime.setBounds(30, 70, 120, 25);
        lblTime.setFont(font);
        add(lblTime);

        txtTime = new JTextField();
        txtTime.setBounds(160, 70, 180, 25);
        txtTime.setFont(font);
        add(txtTime);

        // Rate
        lblRate = new JLabel("Rate (R)%:");
        lblRate.setBounds(30, 110, 120, 25);
        lblRate.setFont(font);
        add(lblRate);

        txtRate = new JTextField();
        txtRate.setBounds(160, 110, 180, 25);
        txtRate.setFont(font);
        add(txtRate);

        // Calculate Button
        btnCalculate = new JButton("Calculate");
        btnCalculate.setBounds(130, 150, 120, 30);
        btnCalculate.setFont(font);
        btnCalculate.addActionListener(this);
        add(btnCalculate);

        // Result
        lblResult = new JLabel("Simple Interest:");
        lblResult.setBounds(30, 200, 130, 25);
        lblResult.setFont(font);
        add(lblResult);

        txtResult = new JTextField();
        txtResult.setBounds(160, 200, 180, 25);
        txtResult.setFont(font);
        txtResult.setEditable(false);
        add(txtResult);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double p = Double.parseDouble(txtPrincipal.getText());
            double t = Double.parseDouble(txtTime.getText());
            double r = Double.parseDouble(txtRate.getText());

            double si = (p * t * r) / 100;
            txtResult.setText(String.format("%.2f", si));
        } catch (NumberFormatException ne) {
            JOptionPane.showMessageDialog(this,
                    "Please enter valid numbers!",
                    "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new SimpleInterestExample();
    }
}