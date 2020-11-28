package buoi3.bai8;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.xml.transform.Source;

public class Dictionary extends Word {
    private String tienganh;
     private  String nghia;
    public Dictionary(String tienganh, String nghia) {
        this.tienganh = tienganh;
        this.nghia = nghia;
    }
    ArrayList<Word> dsList = new ArrayList<>();
    public Dictionary() {
    }
    public void sapxep() {
        Collections.sort(dsList, new Comparator<Word>() {
            public int compare(Word o1, Word o2) {
                return o1.getEn().compareTo(o2.getEn());
            }
        });
    }
    public void hien() {
        docfile();
        sapxep();
        for (Word tmp : dsList) {
            tmp.xuat();
        }
    }
    public void docfile() {
        try {
            File file = new File("tudien.dat");
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] cat = line.split("-");
                id = cat[0];
                en = cat[1];
                vn = cat[2];
                Word tmp = new Word(id, en, vn);
                dsList.add(tmp);    
            }
        } catch (Exception e) {
        }
    }
    public void luufile(){
        docfile();
        themtu();
        try (PrintWriter pw = new PrintWriter("tudien.dat")) {
            sapxep();
            for (Word tmp : dsList) {
                pw.println(tmp.luu());
            }
        } catch (Exception e) {
        }
    }
    public String dich() {
        docfile();
        Map<String, String> dic = new HashMap<String, String>();
        for (Word tmp : dsList) {
            String[] s = tmp.luu().split("-");
            dic.put(s[1], s[2]);
        }
        String w = tienganh.toLowerCase();
        String t = dic.get(w);
        if (t == null) {
   return "";
        } else {
            return dic.get(w);
        }
    }
    public void themtu(){
        Word y=new Word("0",tienganh,nghia);
        dsList.add(y);
    }
}
