package repository;

import java.util.List;
import model.Grade;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import model.Students;
import utility.JDBC_Helper;

public class Grade_Repository {
    public static List<Grade> getALLGrade() {
        List<Grade> listGrade = new ArrayList<>();
        String sql = "select id, Grade.maSV, tiengAnh, tinhoc, GDTC, hoTen from Grade join Students on Grade.maSV = Students.maSV";
        ResultSet rs = JDBC_Helper.selectTongQuat(sql);
        try {
            while (rs.next()) {                
                int id = rs.getInt("id");
                String maSV  = rs.getString("maSV");
                double tiengAnh = rs.getDouble("tiengAnh");
                double tinHoc = rs.getDouble("tinhoc");
                double gdtc = rs.getDouble("GDTC");
                String hoTen = rs.getString("hoTen");
                Students stu = new Students(maSV, hoTen);
                Grade gra = new Grade(id, stu, tiengAnh, tinHoc, gdtc);
                listGrade.add(gra);
            }
            return listGrade;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static Grade getGradebyMaSV(String ma) {
        Grade gra = null;
        String sql = "select id, Grade.maSV, tiengAnh, tinhoc, GDTC, hoTen from Grade join Students on Grade.maSV = Students.maSV where Grade.maSV = ?";
        ResultSet rs = JDBC_Helper.selectTongQuat(sql, ma);
          try {
            while (rs.next()) {                
                int id = rs.getInt("id");
                String maSV  = rs.getString("maSV");
                double tiengAnh = rs.getDouble("tiengAnh");
                double tinHoc = rs.getDouble("tinhoc");
                double gdtc = rs.getDouble("GDTC");
                String hoTen = rs.getString("hoTen");
                Students stu = new Students(maSV, hoTen);
                gra = new Grade(id, stu, tiengAnh, tinHoc, gdtc);
            }
            return gra;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static void sapXepTheoDiem(List<Grade> listGrade) {
        Collections.sort(listGrade, (a, b) ->(int)(b.getTB() - a.getTB()));
    }
    
}
