/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI1;

import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

/**
 *
 * @author aashgar
 */
public class MainFrame extends JFrame{
    private CalcPanel calcPanel;
    private JTabbedPane tabbedPane;
    private JTextArea textArea;
    public MainFrame(String title) throws HeadlessException {
        super(title);
        tabbedPane = new JTabbedPane();
        calcPanel = new CalcPanel();
        tabbedPane.addTab("Calaculator", null, calcPanel, "To make your calculationa");
        textArea = new JTextArea("Programmimg is very Funny !?!?!?");
        tabbedPane.addTab("Text Area", null, textArea, "Any tip");
        add(tabbedPane);
    }
    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame("Main Window");
        mainFrame.setSize(300, 300);
        mainFrame.setResizable(false);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }
    
}
