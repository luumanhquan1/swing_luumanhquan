/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3.bai1;

import buoi2.bai1.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author ASUS TUF
 */
public class SinhVienMatMa extends SinhVien implements Serializable{
    private String donVi;
    private String luong;

    public SinhVienMatMa(String donVi, String luong, String maSV, String hoTen, Date ngaySinh, String gioiTinh, double diem) {
        super(maSV, hoTen, ngaySinh, gioiTinh, diem);
        this.donVi = donVi;
        this.luong = luong;
    }

    

    public SinhVienMatMa() {
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public String getLuong() {
        return luong;
    }

    public void setLuong(String luong) {
        this.luong = luong;
    }

  

    @Override
    public String toString() {
        return "SinhVienMatMa{" +super.toString()+ ", donVi=" + donVi + ", luong=" + luong + '}';
    }
    public void xuat() {
        System.out.println(toString());
    }
    
    
    
}