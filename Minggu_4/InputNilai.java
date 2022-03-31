/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu_4;

import javax.swing.JOptionPane;

/**
 *
 * @author toshiba
 */
public class InputNilai {
    public static void main(String[] args) {
        int[] nilai = new int[4];
        double nilairata = 0;
        int max,min;
        int i;
        
        // deklarasi nilairata
        nilairata= nilai[0];
        
        // for loop untuk memasukkan inputan nilai menggunakan JOptinePane
        for(i=0; i<4; i++){
            String bilangan = JOptionPane.showInputDialog("Masukkan Banyaknya Data Nilai: ");
            nilai[i] = Integer.parseInt(bilangan);
            System.out.println("Masukkan data nilai ke: " + bilangan);
            nilairata += nilai[i];
        }
        
        // deklarasi variable min dan max
        min= nilai[0];
        max= nilai[0];
        
        // for loop untuk mendapatkan nilai min dan max
        for(i=0; i<4; i++){
            if(nilai[i]>max){
                max = nilai[i];
            }
            else if(nilai[i]<min){
                min = nilai[i];
            }
        }
        //deklarasi variable nilairata
        nilairata = nilairata/i;
        
        System.out.println("----------------------------------");
        System.out.println("Nilai Max = " + max);
        System.out.println("Nilai Min = " + min);
        System.out.println("Nilai Rata-Rata = " + " " + nilairata);
        System.exit(0);
    }
}
