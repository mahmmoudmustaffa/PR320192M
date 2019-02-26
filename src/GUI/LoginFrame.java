/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author aashgar
 */
public class LoginFrame extends JFrame{
    private JLabel labelName, labelPassword;
    private JTextField textFieldName;
    private JPasswordField textFieldPassword;
    private JButton buttonOK, buttonCancel;
    private JPanel loginPanel;
    private JRadioButton radioButtonLow, radioButtonMid,radioButtonHigh;
    private ButtonGroup group;
    private JTextArea textArea;
    private JScrollPane scrollPane;
    public LoginFrame(String title) {
        super(title);
        loginPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        loginPanel.setPreferredSize(new Dimension(440, 150));
        loginPanel.setBorder(BorderFactory.
                createTitledBorder(null, "Login Panel", WIDTH, 
                        TitledBorder.TOP, null, Color.red));
       
        labelName = new JLabel("Login Name:");
        loginPanel.add(labelName);
        textFieldName = new JTextField(30);
        loginPanel.add(textFieldName);
        labelPassword = new JLabel("Password: ");
        loginPanel.add(labelPassword);
        textFieldPassword = new JPasswordField(30);
         buttonOK = new JButton("ok");
         buttonCancel = new JButton("Cancel");
        loginPanel.add(textFieldPassword);
        loginPanel.add(buttonOK);
        loginPanel.add(buttonCancel); 
        createRadioButtons();
        textArea = new JTextArea(100,100);
        textArea.setText("Text Area Text Area\n"+
                "Text Area Text Area\n"+
                "Text Area Text Area\n"+
                "Text Area Text Area\n"+
                "Text Area Text Area\n"+
                "Text Area Text Area\n"+
                "Text Area Text Area\n");
        scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(200, 100));        
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(loginPanel);
        add(scrollPane);
        
        
       
    }
    private void createRadioButtons(){
        radioButtonLow = new JRadioButton("Low");
        radioButtonMid = new JRadioButton("Mid",true);
        radioButtonHigh = new JRadioButton("High");
        group = new ButtonGroup();
        group.add(radioButtonLow);
        group.add(radioButtonMid);
        group.add(radioButtonHigh);
        loginPanel.add(radioButtonLow);
        loginPanel.add(radioButtonMid);
        loginPanel.add(radioButtonHigh);
        
    }
    
}
