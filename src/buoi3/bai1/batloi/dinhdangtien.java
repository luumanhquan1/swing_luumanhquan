/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3.bai1.batloi;

/**
 *
 * @author ASUS TUF
 */
public class dinhdangtien {
    private String tien;

    public dinhdangtien(String tien) {
        this.tien = tien;
    }
    public String dinhdangtien(){
        try {
          double  Tien=Double.valueOf(tien);
        } catch (Exception e) {
            String w=tien;
            for(int i=0;i<w.length();i++){
                char ch=w.charAt(i);
                if(ch==','){
                    String tiente=w.replace(',','.');
                    return tiente;
                }
                else if(ch=='.'){
                         String tiente=w.replace('.',',');
                         return tiente;
                    }
            }
        }
        return tien;
    }
}
