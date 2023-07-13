package repository;


import java.sql.*;
import model.Users;
import utility.JDBC_Helper;

public class Users_Repository {
    public static Users checkLogin(String taiKhoan, String matKhau) {
        Users user = null;
        String sql = "select userName, password, role from Users where userName = ? and password = ?";
        ResultSet rs = JDBC_Helper.selectTongQuat(sql, taiKhoan, matKhau);
        try {
            while (rs.next()) {                
                String userName = rs.getString("userName");
                String pass = rs.getString("password");
                String rol = rs.getString("role");
                user = new Users(userName, pass, rol);
            }
            return user;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
