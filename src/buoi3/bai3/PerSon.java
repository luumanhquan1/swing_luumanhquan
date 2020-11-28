/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3.bai3;

import buoi2.bai3.*;
import java.util.Scanner;

/**
 *
 * @author ASUS TUF
 */
public class PerSon {
    
    private String hoten;
    private String ngaysinh;
    private String diachi;
    private String gioitinh;
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập Họ Tên:");
        hoten=sc.nextLine();
        System.out.println("nhập ngày sinh:");
        ngaysinh=sc.nextLine();
        System.out.println("địa chỉ:");
        diachi=sc.nextLine();
        System.out.println("Giới Tính");
        gioitinh=sc.nextLine();
    }

    public PerSon() {
    }

    @Override
    public String toString() {
        return hoten + "$" + ngaysinh + "$" + diachi + "$" + gioitinh;
    }

    public String xuat(){
      return toString();
    }
    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
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
