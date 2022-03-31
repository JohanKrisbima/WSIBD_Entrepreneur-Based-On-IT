
package Minggu_4;

/**
 *
 * @author toshiba
 */
public class Statement_For {
    public static void main(String[] args) {
        // int i merupakan jumlah baris 
        // int j merupakan jumlah kolom
        for(int i=0; i<=7; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
