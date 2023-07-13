/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import model.Grade;
import repository.Grade_Repository;

/**
 *
 * @author thuon
 */
public class Grade_Service {
    public static List<Grade> getALLGrade() {
        return Grade_Repository.getALLGrade();
    }
     
    public static Grade getStudentByMaSV(String ma) {
        return Grade_Repository.getGradebyMaSV(ma);
    }
    
     public static void sapXepTheoDiem(List<Grade> listGrade) {
         Grade_Repository.sapXepTheoDiem(listGrade);
     }
}
