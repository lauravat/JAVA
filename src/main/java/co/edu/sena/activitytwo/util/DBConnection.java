package co.edu.sena.activitytwo.util;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;

public class DBConnection {
    private static final String URL = "jdbc:mysql://aws.connect.psdb.cloud/activitytwo?sslMode=VERIFY_IDENTITY";
    private static final String USER = "ojnee21dd1kn5map48oi";
    private static final String PASS = "main-2023-apr-27-6bghpf";
    private static BasicDataSource pool;


    public static BasicDataSource getInstance() throws SQLException{
        if (pool == null){
            pool = new BasicDataSource();
            pool.setUrl(URL);
            pool.setUsername (USER);
            pool.setPassword(PASS);
            pool.setInitialSize(3);
            pool.setMinIdle(3);
            pool.setMaxIdle(8);
            pool.setMaxTotal (8);
        }
        return pool;
    }
    // permite usar la coneccion
    public static Connection getConnection() throws SQLException{
        return getInstance().getConnection();
    }
}