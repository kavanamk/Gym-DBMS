/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 */

package javaapplication2;

 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JavaApplication2 {
    
    //constructor 
    
    public JavaApplication2(){
        
    
    }
    
    //Connection method
     
    public static Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:F:/New folder/DB/New folder/DBMS.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            System.out.println("Connection established");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        //establish connection
        JavaApplication2 obj = new JavaApplication2();
        obj.connect();
        
        //open first jfram
        NewJFrame2 obj2 = new NewJFrame2();
        obj2.setVisible(true);
       
        //insert login
 
        
        }
    
}
