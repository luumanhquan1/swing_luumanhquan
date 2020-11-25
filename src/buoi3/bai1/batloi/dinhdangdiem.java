/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3.bai1.batloi;


public class dinhdangdiem {
    private String Diem;
String dinhdang;
    public dinhdangdiem(String Diem) {
        this.Diem = Diem;
    }
public String dinhdang(){
    double diem=0;
     try {
            diem = Double.valueOf(Diem);
        } catch (NumberFormatException numberFormatException) {
            String[] chuoi = new String[5];
            String w = Diem;
            for(int i=0;i<w.length();i++){
                char kiemtra =w.charAt(i);
                if(kiemtra==','){
                chuoi = w.split(",");
            if (diem - 1 < 0) {
                if (chuoi[0].equals("0")) {
                   return chuoi[0] + "." + chuoi[1];
                } else if (chuoi[0].equals("1")) {
                      return chuoi[0] + "." + chuoi[1];
                } else if (chuoi[0].equals("2")) {
                      return chuoi[0] + "." + chuoi[1];
                } else if (chuoi[0].equals("3")) {
                      return chuoi[0] + "." + chuoi[1];
                } else if (chuoi[0].equals("4")) {
                   return chuoi[0] + "." + chuoi[1];
                } else if (chuoi[0].equals("5")) {
                      return chuoi[0] + "." + chuoi[1];
                } else if (chuoi[0].equals("6")) {
                    return chuoi[0] + "." + chuoi[1];
                } else if (chuoi[0].equals("7")) {
                    return chuoi[0] + "." + chuoi[1];
                } else if (chuoi[0].equals("8")) {
                    return chuoi[0] + "." + chuoi[1];
                } else if (chuoi[0].equals("9")) {
                      return chuoi[0] + "." + chuoi[1];
                } else if (chuoi[0].equals("10")) {
                   return chuoi[0] + "." + chuoi[1];
                }
            }
                }
                  else if(kiemtra=='.'){
                chuoi = w.split(".");
            if (diem - 1 < 0) {
                if (chuoi[0].equals("0")) {
                   return chuoi[0] + "," + chuoi[1];
                } else if (chuoi[0].equals("1")) {
                      return chuoi[0] + "," + chuoi[1];
                } else if (chuoi[0].equals("2")) {
                      return chuoi[0] + "," + chuoi[1];
                } else if (chuoi[0].equals("3")) {
                      return chuoi[0] + "," + chuoi[1];
                } else if (chuoi[0].equals("4")) {
                   return chuoi[0] + "," + chuoi[1];
                } else if (chuoi[0].equals("5")) {
                      return chuoi[0] + "," + chuoi[1];
                } else if (chuoi[0].equals("6")) {
                    return chuoi[0] + "," + chuoi[1];
                } else if (chuoi[0].equals("7")) {
                    return chuoi[0] + "," + chuoi[1];
                } else if (chuoi[0].equals("8")) {
                    return chuoi[0] + "," + chuoi[1];
                } else if (chuoi[0].equals("9")) {
                      return chuoi[0] + "," + chuoi[1];
                } else if (chuoi[0].equals("10")) {
                   return chuoi[0] + "," + chuoi[1];
                }
            }
                }
            }
            
        }
     return Diem;
}
}
