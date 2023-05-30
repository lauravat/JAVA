package co.edu.sena.activitytwo.util;

import java.sql.*;

public class UseConnectionPool {
    private static Connection getConnection() throws SQLException {
     return ConectionPool.getConnection();
     }
     public static void main(String[] args) 
    throws SQLException {
     try (Connection conn = getConnection();
     Statement stmt = 
    conn.createStatement();
     ResultSet rs = 
    stmt.executeQuery("SELECT * FROM users_tbl")) {
     while (rs.next()) {
     
    System.out.print(rs.getString("user_firstname"));
     System.out.print(" | ");
     
    System.out.println(rs.getString("user_lastname"));
     }
     }
     }
    } // UseConnectionPool
