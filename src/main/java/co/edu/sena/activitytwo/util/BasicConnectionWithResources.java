package co.edu.sena.activitytwo.util;

import java.sql.*;

public class BasicConnectionWithResources 
{
    public static void main(String[] args) 
    {
        String url ="jdbc:mysql://localhost:3306/Activity?serverTimezone=America/Bogota";
        String username = "LauraUsuario";
        String password ="Laura_Vat-302_4";

        String sql = "SELECT * FROM users_tbl";
        try (Connection conn = DriverManager.getConnection(url, username, password);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql)) {
        while (rs.next()) {
        
        System.out.println(rs.getString("user_firtsname"));
        
        System.out.println(rs.getString("user_lastname"));
        }
        } catch (SQLException e) {
        e.printStackTrace();
        } // end try-catch
        } // main
        } // BasicConnectionWithResources


