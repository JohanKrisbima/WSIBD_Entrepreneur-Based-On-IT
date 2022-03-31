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
public class Array_1dimensi {
    public static void main(String[] args) {
        double[] angka = {2.2,3.12,1.32,5.6,7.7,6.3,9.9,4.5,12.2};
        String[] teks = {"Saya", "sedang", "belajar", "tentang", "OOP", "di Java"};
        
        for(int i=0; i<angka.length; i++){
            // for loop untuk mencetak angka
            System.out.println(angka[i]);
        }
        
        for(int j=0; j<teks.length; j++){
            // for loop untuk mencetak teks
            System.out.print(teks[j] + " ");
        }
    }
}
