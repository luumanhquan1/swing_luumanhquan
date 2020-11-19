
package buoi2.bai3;

import java.util.Scanner;

public class NhanVien extends PerSon{
    private String phongban;
    private double hesoban;
    private double thamlien;
    private double luongcoban;
public void nhap(){
    Scanner sc=new Scanner(System.in);
    super.nhap();
    System.out.println("Phòng Ban");
    phongban=sc.nextLine();
    System.out.println("Hệ Số Lương");
    hesoban=sc.nextDouble();
    System.out.println("thâm liên");
    thamlien=sc.nextDouble();
    System.out.println("Lương cơ bản");
    luongcoban=sc.nextDouble();
}
public double luongthuclinh(){
    return (luongcoban * hesoban *(1+thamlien/100));
}
    @Override
    public String toString() {
        return  super.toString()+ "-" + phongban + "-" + hesoban + "-" + thamlien + "-" + luongcoban+ "-" +luongthuclinh();
    }
  
    @Override
    public String xuat(){
   return  toString();
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

    public NhanVien() {
    }

   
    
    
}
