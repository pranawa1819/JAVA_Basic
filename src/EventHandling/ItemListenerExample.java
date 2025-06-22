package EventHandling;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemListenerExample extends JFrame implements ItemListener {
    JCheckBox musicCheckbox,sportsCheckbox;
    JRadioButton maleRadio, femaleRadio;
    ButtonGroup genderGroup;
    JLabel resultLabel;

    public ItemListenerExample(){
        setTitle("Example of Item listener");
        setSize(600,300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // CheckBox

        JLabel CheckBoxLabel = new JLabel("Select Hobbies");
        CheckBoxLabel.setBounds(30,20,150,20);
        add(CheckBoxLabel);

        musicCheckbox = new JCheckBox("Music");
        musicCheckbox.setBounds(30,50,100,30);
        musicCheckbox.addItemListener(this);

        sportsCheckbox = new JCheckBox("Sports");
        sportsCheckbox.setBounds(30,80,100,30);
        sportsCheckbox.addItemListener(this);

        add(musicCheckbox);
        add(sportsCheckbox);

        // RadioButton

        JLabel Radiolabel = new JLabel("Select Gender");
        Radiolabel.setBounds(200,20,150,20);
        add(Radiolabel);

        maleRadio = new JRadioButton("Male");
        maleRadio.setBounds(200,50,100,30);
        maleRadio.addItemListener(this);
        //Creates a female radio button
        femaleRadio = new JRadioButton("Female");
        femaleRadio.setBounds(200,80,100,30);
        femaleRadio.addItemListener(this);

        genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);

        add(maleRadio);
        add(femaleRadio);

        // label to show result

        resultLabel = new JLabel("Your choice will appear here.");
        resultLabel.setBounds(30,150,350,30);
        add(resultLabel);

        setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String hobbies = "";
        if(musicCheckbox.isSelected())
            hobbies +="Music";
        if(sportsCheckbox.isSelected())
            hobbies +="Sports";

        String gender ="";
        if(maleRadio.isSelected())
            gender = "Male";
        if(femaleRadio.isSelected())
            gender ="Female";

        resultLabel.setText("Hobbies: " +hobbies+ "  | Gender: "+gender);
    }

    public static void main(String[] args) {
        new ItemListenerExample();
    }
}
