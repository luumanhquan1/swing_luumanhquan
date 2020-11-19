/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi2.bai6;

import buoi2.bai3.quanly;
import java.io.FileNotFoundException;

/**
 *
 * @author ASUS TUF
 */
public class main {
    public static void main(String[] args) throws FileNotFoundException {
        processStudent t1=new processStudent();
        t1.nhapSV();
        t1.luufile();
        t1.docfile();
    }
}
