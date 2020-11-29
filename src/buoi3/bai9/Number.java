/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3.bai9;

import static org.eclipse.persistence.platform.database.oracle.plsql.OraclePLSQLTypes.Int;

/**
 *
 * @author ASUS TUF
 */
public class Number {
   private int value;
   private double min;
   private double max;
    public Number(int value, double min, double max) {
        this.value = value;
        this.min = min;
        this.max = max;
    }

    

    @Override
    public String toString() {
        return "Number{" + "value=" + value + ", min=" + min + ", max=" + max + '}';
    }
public void xuat(){
    System.out.println(toString());
}
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

   public boolean kiemtrasnt(){
       int snt=0;
      for(int i=1;i<=value;i++){
          if(value%i==0){
              snt++;
          }
      }
      if(snt==2){
          return true;
      }
      else{
      return false;
      }
   }
   public boolean kiemtraminmax(){
       if(min<value&&value<max){
           return true;
       }
       else{
           return false;
       }
   }
}

