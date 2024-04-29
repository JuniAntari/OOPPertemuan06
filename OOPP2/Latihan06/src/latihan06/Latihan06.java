
package latihan06;
        
import java.util.Scanner;

/**
 *
 * @author NI kadek Juni Antari
 * 2201010172
 */
public class Latihan06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan panjang sisi persegi: ");
        double sisi = input.nextDouble();
        
        double luas = sisi * sisi;
        double keliling = 4 * sisi;
        
        System.out.println("Luas persegi: " + luas);
        System.out.println("Keliling persegi: " + keliling);
    }
    
}


