package GUIControls;

import javax.swing.*;
import java.awt.*;

public class CheckBoxExample extends JFrame {
    JCheckBox sahil, pranawa, panda, mendak;
    CheckboxGroup cg;
    public CheckBoxExample(){
        setSize(600,600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("CheckBox");
        setLocationRelativeTo(null);
        setResizable(false);

        //Making a new checkbox
        sahil = new JCheckBox("Sahil");
        add(sahil).setBounds(200,200,100,30);

        pranawa = new JCheckBox("Pranawa");
        add(pranawa).setBounds(300,200,100,30);

        panda = new JCheckBox("Panda");
        add(panda).setBounds(400,200,100,30);

        mendak = new JCheckBox("Mendak");
        add(mendak).setBounds(500,200,100,30);

    }

    public static void main(String[] args) {
        new ComboBoxExamples();
    }
}
