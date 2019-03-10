/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI2;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author aashgar
 */
public class MainFrame extends JFrame implements
        ActionListener{
    private JMenuBar menuBar;
    private JMenu menuFile,menuEdit;
    private JMenuItem menuItemOpen, menuItemClose,
            menuItemExit,
            menuItemFont, menuItemColr;

    public MainFrame(String title) throws HeadlessException {
        super(title);
        menuBar = new JMenuBar();
        menuFile = new JMenu("File");
        menuFile.setMnemonic('F');
        menuItemOpen = new JMenuItem("Open", 'O');
        menuItemOpen.addActionListener(this);
        menuFile.add(menuItemOpen);
        menuBar.add(menuFile);
        setJMenuBar(menuBar);
    }
    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame("Main Window");
        mainFrame.setSize(300, 250);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int value = (int)JOptionPane.showInputDialog(
                null,
                "Select Font Size", 
                "Font Size", 
                JOptionPane.WARNING_MESSAGE, 
                null,
                new Integer[] {12, 14,16,18 },
                14);
        System.out.println(value);
    }
    
}
