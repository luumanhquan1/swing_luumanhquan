/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3.bai1;

import buoi2.bai1.*;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.scene.chart.PieChart;
import jdk.nashorn.internal.ir.CatchNode;

/**
 *
 * @author ASUS TUF
 */
public class SinhVien implements Serializable{
    private String maSV;
    private String hoTen;
    private Date ngaySinh;
    private String gioiTinh;
    private double diem;
    private Object ngaysinh;

    public SinhVien(String maSV, String hoTen, Date ngaySinh, String gioiTinh, double diem) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diem = diem;
    }

   
    
    public SinhVien() {
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }


  public String getNgaysinh1() {
        SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
        String time=sdf.format(ngaySinh);
        return time;
    }
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public void nhap()
    {
        
    }
    @Override
    public String toString() {
        return "maSV=" + maSV + ", hoTen=" + hoTen + ", ngaySinh=" +  getNgaysinh1() + ", gioiTinh=" + gioiTinh + ", diem=" + diem;
    }
public void xuat(){
    System.out.println(toString());
}
    void setLuong(int parseInt) {
        
    }

    void setDonVi(String text) {
        
    }
    void setHocPhi(float hocPhi){
        
    }
    
    
}