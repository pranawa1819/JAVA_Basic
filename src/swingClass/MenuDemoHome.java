package swingClass;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuDemoHome extends JFrame {
    JMenuBar mb;
    JMenu m1,m2,m3;
    JMenu i1,i2,i3,i4;
    JMenuItem it,is,ut,us,ds,dt,rt,rs,exiItem;
    public MenuDemoHome(){
        //Create menu bar
        mb = new JMenuBar();
        setJMenuBar(mb);

        //top-level menu
        m1 = new JMenu("Home");
        m2 = new JMenu("View");
        m3 = new JMenu("Exit");

        mb.add(m1);
        mb.add(m2);
        mb.add(m3);

        //submenus under home
        i1 = new JMenu("Insert");
        i2 = new JMenu("Update");
        i3 = new JMenu("Delete");
        i4 = new JMenu("Report/");

        m1.add(i1);
        m1.add(i2);
        m1.add(i3);
        m1.add(i3);

        //Insert Items

        is = new JMenuItem("Insert Student");
        i1.add(is);
        it = new JMenuItem("Insert Teacher");
        i1.add(it);

        //update Items

        us = new JMenuItem("Update Student");
        i2.add(us);
        ut = new JMenuItem("Update  Teacher");
        i2.add(ut);

        //delete items
        ds = new JMenuItem("Delete Student");
        i3.add(ds);
        dt = new JMenuItem("Delete Teacher");
        i3.add(dt);


        //report items
        rs = new JMenuItem("Report Student");
        i4.add(rs);
        rt = new JMenuItem("Report Teacher");
        i4.add(rt);

        //Exit menu items under exit
        exiItem = new JMenuItem("Exit");
        m3.add(exiItem);

        //exit action listener
        exiItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int confirm = JOptionPane.showConfirmDialog(MenuDemoHome.this, "Are you sure you want to exit","Exit Confirmation",JOptionPane.YES_NO_OPTION);
                if(confirm == JOptionPane.YES_OPTION){
                    System.exit(0);
                }
            }
        });
        setSize(600,600);
        setTitle("Menu Example");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setIconImage(new ImageIcon("image/b.png").getImage());
        setVisible(true);
    }

    public static void main(String[] args) {
        new MenuDemoHome();
    }
}
