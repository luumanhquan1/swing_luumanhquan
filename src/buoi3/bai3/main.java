/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3.bai3;

import buoi2.bai3.*;
import buoi2.bai4.thisinhA;
import java.io.FileNotFoundException;

/**
 *
 * @author ASUS TUF
 */
public class main {
    public static void main(String[] args) throws FileNotFoundException {
        quanly t=new quanly();
        t.nhapNV();
        t.luufile();
        t.docfile();
       NewJFrame t1=new NewJFrame();
       t1.setVisible(true);
       t1.setLocationRelativeTo(null);
    }
}
