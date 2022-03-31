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
public class PilihMenuCafe {
    public static void main(String[] args) {
        // membuat tipe data dan variable
        int pilih;
        String nama;
        String namaMakanan = null;
        // membuat Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("     CAFE BangJO");
        System.out.println("    ANEKA MAKANAN");
        System.out.println("======================");
        System.out.println("    SPECIAL MENU :");
        System.out.println("1. Spageti");
        System.out.println("2. Indomie Pedes Nampol");
        System.out.println("3. Seblak");
        System.out.println("4. Chicken Nughet");
        System.out.println("5. Nasi Goreng");
        System.out.println("======================");
        System.out.print("Masukkan Nama Pembeli : ");
        nama = input.nextLine(); // input nama
        System.out.print("\nSilahkan masukkan pilihan anda : ");
        pilih = input.nextInt(); // input pilihan menu
        // percabangan switch case
        switch(pilih){
            case 1:
                namaMakanan = "Spageti";
                break;
            case 2:
                namaMakanan = "Indomie Pedes Nampol";
                break;
            case 3:
                namaMakanan = "Seblak";
                break;
            case 4:
                namaMakanan = "Chicken Nughet";
                break;
            case 5:
                namaMakanan = "Nasi Goreng";
            default:
                System.out.println("Inputan anda salah");
        }
        System.out.println("Minuman yang anda pesan adalah "+namaMakanan);
        System.out.println("Pesanan akan segera kami antar");
        System.out.println("Terima Kasih "+nama+" Telah Berkunjung di Cafe BangJO");
    }
    }

