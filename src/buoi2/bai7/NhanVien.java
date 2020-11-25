/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi2.bai7;

import java.util.Date;

/**
 *
 * @author ASUS TUF
 */
public class NhanVien extends PerSon{
    private String phongban;
     private double hesoban;
    private double thamlien;
    private double luongcoban;

    public NhanVien(String phongban, double hesoban, double thamlien, double luongcoban, String hoten, Date ngaysinh, String diachi, String gioitinh) {
        super(hoten, ngaysinh, diachi, gioitinh);
        this.phongban = phongban;
        this.hesoban = hesoban;
        this.thamlien = thamlien;
        this.luongcoban = luongcoban;
    }

  

    public NhanVien(double hesoban, double thamlien, double luongcoban) {
        this.hesoban = hesoban;
        this.thamlien = thamlien;
        this.luongcoban = luongcoban;
    }

  
public double luongthuclinh(){
    return luongcoban*hesoban*(1+thamlien/100);
}
    @Override
    public String toString() {
        return "NhanVien{"+super.toString() + "phongban=" + phongban + ", hesoban=" + hesoban + ", thamlien=" + thamlien + ", luongcoban=" + luongcoban +"luong thuc linh"+luongthuclinh() +'}';
    }
public void xuat(){
    System.out.println(toString());
}
    public String getPhongban() {
        return phongban;
    }

    public void setPhongban(String phongban) {
        this.phongban = phongban;
    }

    public double getHesoban() {
        return hesoban;
    }

    public void setHesoban(double hesoban) {
        this.hesoban = hesoban;
    }

    public double getThamlien() {
        return thamlien;
    }

    public void setThamlien(double thamlien) {
        this.thamlien = thamlien;
    }

    public double getLuongcoban() {
        return luongcoban;
    }

    public void setLuongcoban(double luongcoban) {
        this.luongcoban = luongcoban;
    }
    
}
