package pertemuan06;

import java.util.Scanner;

/**
 *
 * @author Juni Antari
 * tgl: 2024-04-29
 */
public class Pertemuan06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dIN = new Scanner(System.in);
        
        System.out.print("Nilai Alas :");
        float nAlas = dIN.nextFloat();
        
        System.out.print("Nilai Tinggi :");
        float nTinggi =dIN.nextFloat();
       
        LuasSegi3 LS = new LuasSegi3(nAlas, nTinggi);
        
      //LS.setAlas(71);
     // LS.setTinggi(86);
        LS.HLuasSegi3();
        
        
        System.out.println("Nilai Alas:" +LS.getAlas());
        System.out.println("Nilai Tinggi:" +LS.getTinggi() );
        System.out.println("Jadi luas Segi Tiga: ");
        System.out.println("luas = ½ X Alas X Tinggi");
        System.out.println("   = ½ X "+ LS.getAlas()+"X "+LS.getTinggi() );
        System.out.println("   =" + LS.getLuas());
        
        
    }
    
}
