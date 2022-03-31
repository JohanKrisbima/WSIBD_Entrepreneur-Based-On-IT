/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu_3;
//import Scanner
import java.util.Scanner;
/**
 *
 * @author toshiba
 */
public class SwtchCase {
    public static void main(String[] args) {
        // membuat scanner
        Scanner input = new Scanner(System.in);
        String lampu;
        
        System.out.print("Inputkan nama warna: ");
        lampu = input.next();
        
        // membuat pilihan menggunakan switch case
        switch(lampu){
            case "merah":
                System.out.println("Lampu merah, Harap berhenti");
                break;
            case "kuning":
                System.out.println("Lampu kuning, Dimohon berhati-hati");
                break;
            case "hijau":
                System.out.println("Lampu hijau, silahkan jalan");
                break;
            default:
                System.out.println("Warna lampu salah");
        }
    }
}
