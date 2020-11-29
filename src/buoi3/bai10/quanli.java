/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3.bai10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS TUF
 */
public class quanli extends Book {

    private String Id;
    private String Authors;
    private String Title;
    private String Category;
    

    public quanli(String Id, String Authors, String Title, String Category) {
        this.Id = Id;
        this.Authors = Authors;
        this.Title = Title;
        this.Category = Category;
    }
    ArrayList<Book> dsBooks = new ArrayList<>();
    public quanli() {
    }

    public void docfile() {
        try {
            File file=new File("Books.dat");
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] a = line.split("\\$");
                id = a[0];
                authors = a[1];
                title = a[2];
                category = a[3];
                Book t = new Book(id, authors, title, category);
                dsBooks.add(t);
            }
        } catch (Exception e) {
        }
    }

    public void luufile() {
        docfile();
        ThemSach();
        try (PrintWriter pw = new PrintWriter("Books.dat")) {
            for (Book tmp : dsBooks) {
                pw.println(tmp);
            }
        } catch (Exception e) {
        }
    }
    public void ThemSach() {
        Book t = new Book(Id, Authors, Title, Category);
        dsBooks.add(t);
        System.out.println(dsBooks);
    }
public boolean loitrungid(){
    docfile();
    for(Book tmp:dsBooks){
     String[] w=tmp.toString().split("\\$");
    if(Id.equalsIgnoreCase(w[0])){
        return false;
    }
        
   }
   return true;
}
}
