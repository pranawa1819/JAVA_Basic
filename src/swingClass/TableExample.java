package swingClass;

import javax.swing.*;
import javax.swing.table.JTableHeader;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TableExample extends JFrame {
    DefaultTableModel dtm;
    JTable table;
    JScrollPane sp;

    public TableExample() {

        // Create and set up the table model
        dtm = new DefaultTableModel();
        dtm.addColumn("ID");
        dtm.addColumn("Name");
        dtm.addColumn("Address");
        dtm.addColumn("Phone Number");
        dtm.addColumn("Email");

        // Add some sample data
        dtm.addRow(new Object[]{"1", "Panda K.C", "Bansbari", "9841309491", "panadathapa19@gmail.com"});
        dtm.addRow(new Object[]{"2", "Mendak Bhattarai", "Pasikot", "9867575644", "mendak123@gmail.com"});

        // Create the JTable and assign the model
        table = new JTable(dtm);
        table.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        table.setForeground(Color.BLACK);
        table.setRowHeight(25);

        // Customize table header
        JTableHeader header = table.getTableHeader();
        header.setFont(new Font("SansSerif", Font.BOLD, 18));
        header.setForeground(Color.BLUE);

        // Set up the scroll pane
        sp = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        //sp.setBounds(10, 10, 560, 200);
        add(sp);

        // Configure the frame
        setSize(600, 300); // Adjusted size to fit scroll pane
        setTitle("Table Example");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TableExample();
    }
}
