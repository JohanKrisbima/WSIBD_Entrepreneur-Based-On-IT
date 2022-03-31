/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu_3;

import java.util.Scanner;

/**
 *
 * @author toshiba
 */
public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai;

        System.out.print("Masukkan nilai : ");
        nilai = input.nextInt();

        if(nilai >= 80){
                System.out.println("nilai A");
        }
        else if(nilai >= 71){
            System.out.println("nilai B");
        }
        else if(nilai >= 61){
            System.out.println("nilai C");
        }
        else if(nilai >= 45){
            System.out.println("nilai D");
        }
        else{
            System.out.println("nilai E");
        }
    }
}
