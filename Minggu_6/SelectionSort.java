/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu_6;

/**
 *
 * @author toshiba
 */
public class SelectionSort {
    public static void main(String[] args) {
        int nilai [] = {6,4,5,2,3};
       
        for (int i = 0 ; i<nilai.length-1;i++){
            int min = i;
            for (int x = 1+i ; x<nilai.length; x++){
                 /*System.out.println(min+" "+x);*/
                if (nilai[min] > nilai[x]){
                    min = x;
                }
            }
            int z= nilai[min];
            nilai[min] = nilai [i];
            nilai[i] = z;
        }
        for (int i = 0 ; i<nilai.length;i++){
            System.out.print(nilai[i]+" ");
        }
    }
}
