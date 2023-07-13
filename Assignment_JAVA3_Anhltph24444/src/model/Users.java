package model;

public class Users {
    private String userName;
    private String pass;
    private String rol;

    public Users() {
    }

    public Users(String userName, String pass, String rol) {
        this.userName = userName;
        this.pass = pass;
        this.rol = rol;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

   
    
}
