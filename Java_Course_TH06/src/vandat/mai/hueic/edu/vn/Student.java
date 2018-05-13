package vandat.mai.hueic.edu.vn;


import java.time.ZoneId;
import java.util.Date;

public class Student{
    private String ma;
    private String hoten;
    private int namsinh;
    private boolean gioitinh;

    public Student(String ma, String hoten, int namsinh, boolean gioitinh) {
        this.ma = ma;
        this.hoten = hoten;
        this.namsinh = namsinh;
        this.gioitinh = gioitinh;
    }

    public Student() {

    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public boolean getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public int TinhTuoi(){
        return (new Date()).toInstant().atZone(ZoneId.systemDefault()).getYear()  - this.getNamsinh();
    }

    @Override
    public String toString() {
        return "Students{" +
                "ma='" + ma + '\'' +
                ", hoten='" + hoten + '\'' +
                ", namsinh=" + namsinh +
                ", gioitinh=" + ((gioitinh)?"Man":"Woman") +
                ", Tuổi = " + TinhTuoi() +
                '}';
    }
}
