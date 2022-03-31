
package Minggu_4;

/**
 *
 * @author toshiba
 */
public class Statement_DoWhile {
    public static void main(String[] args) {
        // membuat tipe data dan variabel
        int j=1;
        
        do{
            //blok yang akan di ulang
            System.out.println("Perulangan ke-" + j);
            j++; // increment
        }
        while(j<11);
    }
    
}
