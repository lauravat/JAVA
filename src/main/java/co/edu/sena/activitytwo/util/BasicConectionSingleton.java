package co.edu.sena.activitytwo.util;

import java.sql.*;


public class BasicConectionSingleton {

    private static String url="jdbc:mysql://localhost:3306/Activity?serverTimezone=America/Bogota";
    private static String user= "LauraUsuario";
    private static String password="Laura_Vat-302_4";
    private static Connection conn;

    public static Connection getInstance() throws SQLException{
        if(conn==null){
            conn= DriverManager.getConnection(url, user, password);
        }
        return conn;
    }
    
}
