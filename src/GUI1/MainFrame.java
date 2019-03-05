/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI1;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author aashgar
 */
public class MainFrame extends JFrame{
    private CalcPanel calcPanel;

    public MainFrame(String title) throws HeadlessException {
        super(title);
        calcPanel = new CalcPanel();
        add(calcPanel);
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
