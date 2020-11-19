/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi2.bai6;

import java.util.Scanner;

/**
 *
 * @author ASUS TUF
 */
public class Student {
    private String hoten;
    private int tuoi;
public void nhap(){
    Scanner sc=new Scanner(System.in);
    System.out.println("nhập họ tên");
    hoten=sc.nextLine();
    System.out.println("nhập tuổi");
    tuoi=sc.nextInt();
}
    public Student() {
    }

    public Student(String hoten, int tuoi) {
        this.hoten = hoten;
        this.tuoi = tuoi;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    
}
