/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3.bai1;

import buoi2.bai1.*;
import java.io.Serializable;
import java.util.Date;


 public class SinhVienHTTT extends SinhVien implements Serializable {
    private String hocPhi;

    public SinhVienHTTT() {
    }

    public SinhVienHTTT(String hocPhi, String maSV, String hoTen, Date ngaySinh, String gioiTinh, double diem) {
        super(maSV, hoTen, ngaySinh, gioiTinh, diem);
        this.hocPhi = hocPhi;
    }

   
    @Override
    public String toString() {
        return "SinhVienHTTT{" + super.toString()+", hocPhi=" + hocPhi + '}';
    }

   public void xuat() {
        System.out.println(toString());
    }

   
    
    
}
