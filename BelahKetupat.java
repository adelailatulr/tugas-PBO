/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menghitungbidang;

/**
 *
 * @author asus
 */
public class BelahKetupat {
     private int sisi, kelilingBelahKetupat;
        
     public int getSisi() {
         return sisi;
     }
     
     public void setSisi(int sisi) {
         this.sisi=sisi;
     }
     
     public BelahKetupat(){
         int s = 0;
     }
     
     public int keliling(int s){
         return 4*s;
     }
     
     public int getKeliling(){
         return keliling(sisi);
     }

    
}
