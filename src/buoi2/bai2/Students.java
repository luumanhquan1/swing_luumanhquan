
package buoi2.bai2;

import java.io.Serializable;


public class Students extends PerSon implements Serializable{
    private String Masv;
    private String email;
    private double Diem;

    public Students() {
    }

    @Override
    public String toString() {
        return "Students{" + super.toString() + "Masv=" + Masv + ", email=" + email + ", Diem=" + Diem + '}';
    }

    public String getMasv() {
        return Masv;
    }

    public void setMasv(String Masv) {
        this.Masv = Masv;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getDiem() {
        return Diem;
    }

    public void setDiem(double Diem) {
        this.Diem = Diem;
    }

  public void xuat(){
      System.out.println(toString());
  }

    public Students(String Masv, String email, double Diem, String Hoten, String Ngaysinh, String Diachi, String Gioitinh) {
        super(Hoten, Ngaysinh, Diachi, Gioitinh);
        this.Masv = Masv;
        this.email = email;
        this.Diem = Diem;
    }
    
    
}
