/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu_4;
import java.util.Scanner;
/**
 *
 * @author toshiba
 */
public class BilanganGenap {
    public static void main(String[] args) {
        // membuat Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai Awal:");
        int i = input.nextInt(); // input nilai awal
        System.out.print("Masukkan nilai Akhir:");
        int j = input.nextInt(); // input nilai akhir
        System.out.println("====Bilangan Genap===");
        // perulangan for         
        for(int k =i; k<=j; k++){
            if(k%2 == 0){
                System.out.println(k+"");
            }
        }
    }
}
