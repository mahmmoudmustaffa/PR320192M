/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author aashgar
 */
public class DbConnection {
    private static DbConnection adbConnection;
    private Connection aConnection;
    private Statement aStatement;

    private DbConnection() {
    }
    public static DbConnection getdbConnection(){
        if(adbConnection == null)
            adbConnection = new DbConnection();
        return adbConnection;
    }
    private void createStatement(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.aConnection = DriverManager.
         getConnection("jdbc:mysql://localhost:3306/university",
                 "root","root");
            this.aStatement = this.aConnection.createStatement();
        } catch (Exception ex) {
        }
               
    }
    public void closeConnection(){
        try {
            this.aStatement.close();
            this.aConnection.close();            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public boolean verifyUser(String name, String password){
           boolean isFound = false;
        try {
            createStatement();
            ResultSet rs = this.aStatement.
              executeQuery("Select * From users Where userName='"+
                     name + "' And password='" + 
                      password + "'");
            if(rs.next())
               isFound = true;
           
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
         return isFound;
    }
    public ObservableList<Student> getStudents(){
        ObservableList<Student> studentsList =
                    FXCollections.observableArrayList();
        try {            
            createStatement();
            ResultSet rs = this.aStatement.
                    executeQuery("Select * From students");
            while(rs.next()){
                Student student = new Student(
                        rs.getInt("ID"), 
                        rs.getString("name"),
                        rs.getString("major"),
                        rs.getDouble("grades"));
                studentsList.add(student);
                
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return studentsList;
    }
}
