package repository;

import java.util.ArrayList;
import java.util.List;
import model.Students;
import java.sql.*;
import javax.swing.JOptionPane;
import utility.JDBC_Helper;

public class Students_Repository {
    public static List<Students> getALLStudents() {
        List<Students> listStudent = new ArrayList<>();
        String sql = "select * from Students";
        ResultSet rs = JDBC_Helper.selectTongQuat(sql);
        try {
            while (rs.next()) {                
                String maSV = rs.getString("maSV");
                String hoTen = rs.getString("hoTen");
                String email = rs.getString("email");
                String soDT = rs.getString("soDT");
                boolean gioiTinh = rs.getBoolean("gioiTinh");
                String diaChi = rs.getString("diaChi");
                String hinh = rs.getString("hinh");
                Students student = new Students(maSV, hoTen, email, soDT, gioiTinh, diaChi, hinh);
                listStudent.add(student);
            }
            return listStudent;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static Students getStudentByMaSV(String ma) {
        Students student = null;
        String sql = "select * from Students where maSV = ?";
        ResultSet rs = JDBC_Helper.selectTongQuat(sql, ma);
        try {
            while (rs.next()) {                
                String maSV = rs.getString("maSV");
                String hoTen = rs.getString("hoTen");
                String email = rs.getString("email");
                String soDT = rs.getString("soDT");
                boolean gioiTinh = rs.getBoolean("gioiTinh");
                String diaChi = rs.getString("diaChi");
                String hinh = rs.getString("hinh");
                student = new Students(maSV, hoTen, email, soDT, gioiTinh, diaChi, hinh);
            }
            return student;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static int addStudent(Students stu) {
        String sql = "insert into Students(maSV, hoTen, email, soDT, gioiTinh, diaChi, hinh) values (?, ?, ?, ?, ?, ?, ?)";
        if (checkTrungMa(stu.getMaSV())) {
            JOptionPane.showMessageDialog(null, "Trung ma Sinh Vien");
            return 0;
        } else {
            return JDBC_Helper.updateTongQuat(sql, stu.getMaSV(), stu.getHoTen(), stu.getEmail(), stu.getSoDT(), stu.isGioiTinh(), stu.getDiaChi(), stu.getHinh());
        }
    }
    
    public static boolean checkTrungMa(String ma) {
        Students stu = getStudentByMaSV(ma);
        if (stu == null) return false;
        else return true;
    }
    
    public static int deleteStudent(Students stu) {
        String sql = "delete from Students where maSV = ?";
        int luaChon = JOptionPane.showConfirmDialog(null, "Ban co muon xoa khong?", "Message", JOptionPane.YES_NO_OPTION);
        if (luaChon == JOptionPane.YES_OPTION) {
            return JDBC_Helper.updateTongQuat(sql, stu.getMaSV());
        } else {
            return 0;
        }
    }
    
    public static int updateStudent(Students stu) {
        String sql = "update Students set hoTen = ?, email = ?, soDT = ?, gioiTinh = ?, diaChi = ?, hinh = ? where maSV = ?";
        return JDBC_Helper.updateTongQuat(sql, stu.getHoTen(), stu.getEmail(), stu.getSoDT(), stu.isGioiTinh(), stu.getDiaChi(), stu.getHinh(), stu.getMaSV());
    }
}
