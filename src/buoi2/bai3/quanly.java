
package buoi2.bai3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class quanly {
    ArrayList<NhanVien> dsNhanVien=new ArrayList<>();
    public void nhapNV(){
        Scanner sc=new Scanner(System.in);
        String chon="";
        while (true) {
                  if(chon.equalsIgnoreCase("k")){
                      break;
                  }  
                  NhanVien tmp=new NhanVien();
                  tmp.nhap();
                  dsNhanVien.add(tmp);
                  System.out.println("bạn có muốn nhập nữa không");
                  chon=sc.nextLine();
        }
    }
  
   public void luufile() throws FileNotFoundException{
        
       PrintWriter printWriter=new PrintWriter(new File("nhanvien.dat"));
        for(NhanVien tmp:dsNhanVien){
           printWriter.println(tmp.xuat());
        }
        printWriter.close();
   }
}


