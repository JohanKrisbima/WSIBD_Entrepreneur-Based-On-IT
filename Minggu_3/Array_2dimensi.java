/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu_3;

/**
 *
 * @author toshiba
 */
public class Array_2dimensi {
    public static void main(String[] args) {
        double[][] angka = {{2.0, 6.5, 5.7, 4.5},{9.0, 3.3, 5.3, 7.8},{1.4, 2.5, 1.9, 7.5}};
        
        // membuat for loop untuk mencetak baris dan kolom
        for(int baris=0; baris<3; baris++){
            for(int kolom=0; kolom<4; kolom++){
                System.out.print(angka[baris][kolom] + " ");
            }
            System.out.println("");
        }
    }
}
