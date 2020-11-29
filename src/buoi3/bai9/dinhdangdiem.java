/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3.bai9;

import buoi3.bai1.batloi.*;

public class dinhdangdiem {

    private String Diem;
    String dinhdang;

    public dinhdangdiem(String Diem) {
        this.Diem = Diem;
    }

    public String dinhdang() {
        double diem = 0;
        try {
            diem = Double.valueOf(Diem);
        } catch (NumberFormatException numberFormatException) {
            String[] chuoi = new String[5];
            String w = Diem;
            for (int i = 0; i < w.length(); i++) {
                char kiemtra = w.charAt(i);
                if (kiemtra == ',') {
                    chuoi = w.split(",");
                    if (diem - 1 < 0) {
                        return chuoi[0] + "." + chuoi[1];
                    }
                } else if (kiemtra == '.') {
                    chuoi = w.split(".");
                    if (diem - 1 < 0) {
                        return chuoi[0] + "," + chuoi[1];
                    }
                }
            }

        }
        return Diem;
    }
}
