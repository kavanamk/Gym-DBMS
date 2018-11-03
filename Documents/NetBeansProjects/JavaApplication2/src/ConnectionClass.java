/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class ConnectionClass {
    
    private static Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:F:\\New folder\\DB\\New folder\\DBMS.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            System.out.println("connection established");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
    public void insert(int gym_id, String gym_type) {
        String sql = "INSERT INTO GYM_INFO(gym_id,gym_type) VALUES(?,?)";
 
        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, gym_id);
            pstmt.setString(2, gym_type);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
