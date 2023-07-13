package service;

import java.util.List;
import model.Students;
import repository.Students_Repository;

public class Students_Service {
    public static List<Students> getALLStudents() {
        return Students_Repository.getALLStudents();
    }
    
    public static Students getStudentByMaSV(String ma) {
        return Students_Repository.getStudentByMaSV(ma);
    }
    
    public static int addStudent(Students stu) {
         return Students_Repository.addStudent(stu);
    }
    
    public static int deleteStudent(Students stu) {
        return Students_Repository.deleteStudent(stu);
    }
    
     public static int updateStudent(Students stu) {
         return Students_Repository.updateStudent(stu);
     }
}
