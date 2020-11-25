/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi2.bai7;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ASUS TUF
 */
public class PerSon {
     private String hoten;
    private Date ngaysinh;
    private String diachi;
    private String gioitinh;

    public PerSon(String hoten, Date ngaysinh, String diachi, String gioitinh) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
    }

 
public double luongthuclinh(){
    return 0;
}
    @Override
    public String toString() {
        return  "hoten=" + hoten + ", ngaysinh=" + getNgaysinh1() + ", diachi=" + diachi + ", gioitinh=" + gioitinh +'}';
    }
public void xuat(){
    System.out.println(toString());
}
    public PerSon() {
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh1() {
        SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
        return sdf.format(ngaysinh);
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

 

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }
    
}
