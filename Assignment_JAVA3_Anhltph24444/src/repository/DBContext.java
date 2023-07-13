package repository;

import java.sql.*;
import java.sql.DriverManager;

public class DBContext {
    static String url = "jdbc:sqlserver://localhost\\LAPTOP-BMKDKM5Q\\SQLEXPRESS:1433;databaseName=Assignment";
    static String user = "sa";
    static String pass = "123";
    
    static {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public static Connection getConnect() {
        try {
            Connection con = DriverManager.getConnection(url, user, pass);
            return con;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
