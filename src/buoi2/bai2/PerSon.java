
package buoi2.bai2;

import java.io.Serializable;

public class PerSon implements Serializable{
    private String Hoten;
     private String Ngaysinh;
      private String Diachi;
       private String Gioitinh;

    public PerSon() {
    }

    @Override
    public String toString() {
        return "Hoten=" + Hoten + ", Ngaysinh=" + Ngaysinh + ", Diachi=" + Diachi + ", Gioitinh=" + Gioitinh + '}';
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(String Ngaysinh) {
        this.Ngaysinh = Ngaysinh;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(String Gioitinh) {
        this.Gioitinh = Gioitinh;
    }

    public PerSon(String Hoten, String Ngaysinh, String Diachi, String Gioitinh) {
        this.Hoten = Hoten;
        this.Ngaysinh = Ngaysinh;
        this.Diachi = Diachi;
        this.Gioitinh = Gioitinh;
    }
       
    
    
}
