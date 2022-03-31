
package Minggu_4;

/**
 *
 * @author toshiba
 */
public class Statement_ForEach {
    public static void main(String[] args) {
        
        // membuat array
        double angka[] = {21.3,52.5,46.2,72.9};
        
        // menggunakan perulangan for each untuk menampilkan angka 
        // variabel = array angka
        for(double x : angka){
            System.out.print(x + "  ");
        }
    }
}
