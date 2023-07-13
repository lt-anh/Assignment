package service;

import model.Users;
import repository.Users_Repository;

public class Users_Service {
     public static Users checkLogin(String taiKhoan, String matKhau) {
         return Users_Repository.checkLogin(taiKhoan, matKhau);
     }
     
   
}
