/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EH;

import javax.swing.JOptionPane;

/**
 *
 * @author aashgar
 */
public class mainApp1 {
    public static void main(String[] args) {
        int num1, num2, result=0;
        
        try {
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter num1"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter num2"));
         
        if(num2 == 0)
            throw new myException("My exception");
        result = num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("Arithmantic  ");
        }
        catch(NumberFormatException e){
            System.out.println("Numeber format error");
        }
        JOptionPane.showMessageDialog(null, result);
        
    }
    
 private static class myException extends ArithmeticException{

        public myException(String msg) {
            super();
        }
     
 }
}
