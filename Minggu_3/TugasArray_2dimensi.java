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
public class TugasArray_2dimensi {
    public static void main(String[] args) {
        int[][] angka = {{2,5,3,8},{6,3,9,6},{7,3,6,4},{3,6,4,8}};
        
        for(int baris=0; baris<4; baris++){
            for(int kolom=0; kolom<4; kolom++){
                System.out.print(angka[baris][kolom] + " ");
            }
            System.out.println("");
        }
    }
}
