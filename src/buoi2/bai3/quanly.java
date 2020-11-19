
package buoi2.bai3;

import com.sun.deploy.uitoolkit.impl.fx.ui.FXUIFactory;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class quanly {
    ArrayList<NhanVien> dsNhanVien=new ArrayList<>();

    public quanly() {
    }
   
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
        PrintWriter printWriter=new PrintWriter("nhanvien.dat");
        for(NhanVien tmp:dsNhanVien){
           printWriter.println(tmp.xuat());
        }
        printWriter.close();
   }
   public void docfile() throws FileNotFoundException{
       File file=new File("nhanvien.dat");
        Scanner s=new Scanner(file);
        String[] sp=new String[100];
        int i=0;
        while (s.hasNext()) {           
           String w=s.next();
           sp[i]=w;
           i++;
       }
       show(sp);
   }

    private void show(String[] sp) {
        
        System.out.printf("|%10s||%10s||%10s||%10s||%10s||%10s||%10s||%10s||%10s|\n","họ tên","Ngày Sinh","Địa Chỉ","Giới Tính","Phòng Ban","Hệ Số lương","Thâm liên","lương cơ bản","lương thực lĩnh");
        for(String word:sp){
            if(word==null){
            break;
            }
            int i=0;
           String s1=word;
                String[] words=s1.split("-");
               for(String w:words){
                   if(i==1){
                       break;
                   }
                   i++;
                   System.out.printf("|%10s||%10s||%10s||%10s||%10s||%10s||%10s||%10s||%10s|\n",words[0],words[1],words[2],words[3],words[4],words[5],words[6],words[7],words[8]);
                }
        }
    }
   
  
   
}


