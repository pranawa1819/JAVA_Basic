package GUIControls;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxExamples extends JFrame implements ActionListener {
    JComboBox cbox;
    JButton btn_click;

    public ComboBoxExamples() {
        setSize(600, 600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("CheckBox");
        setLocationRelativeTo(null);
        setResizable(false);

        cbox = new JComboBox();
        add(cbox).setBounds(200, 380, 200, 40);
        cbox.addItem("--SELECT--");
        cbox.addItem("Kathmandu");
        cbox.addItem("Bhaktapur");
        cbox.addItem("Lalitpur");
        cbox.addItem("Chitwan");

        btn_click = new JButton("Check");
        add(btn_click);
        Rectangle r = new Rectangle(200, 450, 120, 40);
        btn_click.setBounds(r);
        btn_click.addActionListener(this);//Adds the current object(the one this code is inside)


    }

    @Override
    //This method is required for performing the ACTION_LISTENER
    public void actionPerformed(ActionEvent e) {
        if (!cbox.getSelectedItem().equals("--SELECT--")) {
            JOptionPane.showMessageDialog(null, cbox.getSelectedItem());
        }
    }

    public static void main(String[] args) {
        new ComboBoxExamples();
    }
}
