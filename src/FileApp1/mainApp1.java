/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileApp1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aashgar
 */
public class mainApp1 {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Ahmad", "IS", 82.0),
            new Student("Maher", "CS", 82.0),
            new Student("Mohammad", "Prog", 99.99),
        };
        try {
            ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream("./src/FileApp1/Student.ser"));
            for(Student student: students)
                oos.writeObject(student);
            oos.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
    
}
