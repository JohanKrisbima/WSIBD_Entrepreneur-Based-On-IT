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
class data{
    String[] nama = {"Johan", "Bobi", "Bima", "Asmiranti", "Ferdi Dwi", "Ilham", "Okta"};
        public int nomer(){
            int ambil = (int)(Math.random()*nama.length);
            return ambil;
        }
}
public class random_input {
    public static void main(String[] args) {
        int deret;
        Scanner input=new Scanner(System.in);
        data yes = new data();
        System.out.print("Tentukan berapa deret: ");
        deret = input.nextInt();
        for(int i=1;i<=deret;i++){
            int nomor = yes.nomer();
            System.out.println("Juara-"+i+" = "+yes.nama[nomor]);
        }
    }
}
