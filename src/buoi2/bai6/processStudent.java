
package buoi2.bai6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class processStudent {
    int n;
    String hoten;
    int tuoi;
    Scanner sc=new Scanner(System.in);
    ArrayList<Student> dsStudent=new ArrayList<>();

    public processStudent() {
    }
    
   public void nhapSV(){
       System.out.println("bạn cần nhập bao nhiêu sinh viên;");
       n=sc.nextInt();
       for(int i=0;i<n;i++){
           Student tmp=new Student();
           tmp.nhap();
           dsStudent.add(tmp);
       }
   }
   public void luufile() throws FileNotFoundException{
       PrintWriter pw=new PrintWriter(new File("student.dat"));
       for(Student s:dsStudent){
           pw.println(s.getHoten());
           pw.println(s.getTuoi());
       }
       pw.close();
   }
   public void docfile() throws FileNotFoundException{
       File file=new File("student.dat");
       Scanner sv=new Scanner(file);
       String[] word= new String[100];
       int i=0;
       while(sv.hasNext()){
           String S=sv.next();
           word[i]=S;
           i++;
       }
       show(word);
   }

    private void show(String[] word) {
      for(String sp:word){
          if(sp==null){
              break;
          }
          System.out.println(sp);
    }
    }
}
