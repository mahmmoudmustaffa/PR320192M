/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileApp1;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aashgar
 */
public class mainApp2 {
    public static void main(String[] args) {
        try {
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream("./src/FileApp1/Student.ser"));
            while(true)
                try{
                    Student student = (Student) ois.readObject();
                    System.out.println(student.getName() + " - " +
                            student.getMajor()+ " - " +
                            student.getGrade());
                }catch(EOFException ex){
                    break;
                }
        } catch (ClassNotFoundException | IOException ex) {
            ex.printStackTrace();
        }
    }
}
