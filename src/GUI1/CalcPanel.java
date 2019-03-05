/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author aashgar
 */
public class CalcPanel extends JPanel{
    private JPanel keysPanel;
    private JButton[] keysButtons;
    private JTextField textFieldLCD;

    public CalcPanel() {
        keysPanel = new JPanel(new GridLayout(4, 4));
        keysButtons = new JButton[16];
        for(int i=0; i<=9; i++)
            keysButtons[i] = new JButton(String.valueOf(i));
       keysButtons[10] = new JButton("/");
       keysButtons[11] = new JButton("*");
       keysButtons[12] = new JButton("-");
       keysButtons[13] = new JButton("+");
       keysButtons[14] = new JButton("=");
       keysButtons[15] = new JButton(".");
       EventHandler eventHandler = new EventHandler();
       for(JButton button:keysButtons){
           button.addActionListener(eventHandler);
           button.setFont(new Font("Serif", Font.BOLD, 14));
           keysPanel.add(button);
       }
       textFieldLCD = new JTextField("LCD");
       textFieldLCD.setFont(new Font("Arial", Font.BOLD, 18));
       textFieldLCD.setForeground(Color.red);
        setLayout(new BorderLayout());
        add(textFieldLCD, BorderLayout.NORTH);
        add(keysPanel,BorderLayout.CENTER);
    }
    private class EventHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            textFieldLCD.setText(
                    ((AbstractButton) e.getSource()).getText());
            
        }
        
    }
    
}
