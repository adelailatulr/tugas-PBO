/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menghitungbidang;

/**
 *
 * @author asus
 */
public class MenghitungBidang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BelahKetupat ketupat = new BelahKetupat();
        
        ketupat.setSisi(8);
        
        System.out.println("Menghitung Keliling Belah Ketupat");
          System.out.println("=========");
        System.out.println("luas:"+ketupat.getSisi());
        System.out.println("Kelilingnya adalah:"+ketupat.getKeliling());
        
        
    }
    
}
