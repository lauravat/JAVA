package co.edu.sena.activitytwo.util;

import java.sql.*;

import org.apache.commons.dbcp2.BasicDataSource;

public class ConectionPool {
    private static String url= "jdbc:mysql://localhost:3306/Activity?serverTimezone=America/Bogota";
    private static String user="LauraUsuario";
    private static String pass="Laura_Vat-302_4";
    private static BasicDataSource pool;
    public static BasicDataSource 
    getInstance() throws SQLException {
    if (pool == null) {
    pool = new BasicDataSource();
    pool.setUrl(url);
    pool.setUsername(user);
    pool.setPassword(pass);
    pool.setInitialSize(5);
    pool.setMinIdle(5);
    pool.setMaxIdle(10);
    pool.setMaxTotal(10);
    }
    return pool;
    }
    public static Connection getConnection() 
    throws SQLException{
    return getInstance().getConnection();
    }
    } // ConnectionPool
