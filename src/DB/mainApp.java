/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aashgar
 */
public class mainApp {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection aConnection = DriverManager.
                    getConnection("jdbc:mysql://localhost:3306/university", 
                            "root", "root");
            Statement asStatement = aConnection.
                    createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE);
            asStatement.setFetchSize(Integer.MIN_VALUE);
            ResultSet rs = asStatement.executeQuery(
                    "Select * From students");
            while(rs.next()){
                double gr = rs.getDouble("grade");
                rs.updateDouble("grade", gr - 2);
                rs.updateRow();
                System.out.printf("%-15s %-15s %8.2f\n",
                        rs.getString("name"),
                        rs.getString("major"),
                        rs.getDouble("grade"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
