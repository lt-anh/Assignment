package model;

public class Grade {
    private int id;
    private Students students;
    private double tiengAnh;
    private double tinHoc;
    private double GDTC;

    public Grade() {
    }

    public Grade(int id, Students students, double tiengAnh, double tinHoc, double GDTC) {
        this.id = id;
        this.students = students;
        this.tiengAnh = tiengAnh;
        this.tinHoc = tinHoc;
        this.GDTC = GDTC;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public double getTiengAnh() {
        return tiengAnh;
    }

    public void setTiengAnh(double tiengAnh) {
        this.tiengAnh = tiengAnh;
    }

    public double getTinHoc() {
        return tinHoc;
    }

    public void setTinHoc(double tinHoc) {
        this.tinHoc = tinHoc;
    }

    public double getGDTC() {
        return GDTC;
    }

    public void setGDTC(double GDTC) {
        this.GDTC = GDTC;
    }

    
    
    public double getTB() {
        return (getTiengAnh()+getTinHoc()+getGDTC()) / 3;
    }
}
