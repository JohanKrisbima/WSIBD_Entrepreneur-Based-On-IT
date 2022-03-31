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
public class Market {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int barang1,barang2,barang3,barang4,barang5;
        String nama;
        
    
        System.out.println("\tJohan Krisbima Plaza <JKP>");
        System.out.println("\t     Promo Belanja");
        System.out.println("    Khusus pembelian 5 barang pertama");
        System.out.println("       Dengan Harga minimum Rp 100000");
        System.out.println("");
        
        System.out.print("Masukkan nama pembeli : ");
        nama = input.next();
        System.out.println("");
        
        System.out.print("Masukkan harga Barang ke-1 :");
        barang1 = input.nextInt();
        System.out.print("Masukkan harga Barang ke-2 :");
        barang2 = input.nextInt();
        System.out.print("Masukkan harga Barang ke-3 :");
        barang3 = input.nextInt();
        System.out.print("Masukkan harga Barang ke-4 :");
        barang4 = input.nextInt();
        System.out.print("Masukkan harga Barang ke-5 :");
        barang5 = input.nextInt();
        
        int total = barang1+barang2+barang3+barang4+barang5;
        System.out.println("Total harga pembelian adalah " + total);
        
        if(total>=100000){
            System.out.println("Selamat....");
            System.out.println("Anda mendapatkan hadiah satu buah mug cantik");
        }
        else{
            System.out.println("Mohon maaf anda belum beruntung untuk mendapatkan hadiah");
        }
        
        System.out.println("");
        System.out.println("\t\tTerima kasih");
        System.out.println("   Anda sudah berkujung di Johan Krisbima Plaza");
    }
}
