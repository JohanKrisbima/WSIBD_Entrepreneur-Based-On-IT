/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu_2;
import java.util.Scanner;

public class prak_Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai1 : ");
        int nilai1 = input.nextInt();
        System.out.print("Masukkan nilai2 : ");
        int nilai2 = input.nextInt();
        
        int hasil = nilai1+nilai2;
        System.out.println("Jumlah = " + hasil);
    }
}
