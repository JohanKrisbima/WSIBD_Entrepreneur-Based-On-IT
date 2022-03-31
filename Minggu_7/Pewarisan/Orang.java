/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu_7.Pewarisan;

/**
 *
 * @author toshiba
 */
public class Orang {
    private String nama;
    private double tinggi;
    private double berat;
    
    public Orang(String nama, double tinggi, double berat){
        this.nama = nama;
        this.tinggi = tinggi;
        this.berat = berat;
    }
    
    public String toString(){
        return ("Nama : " + this.nama + "\nTinggi : " + this.tinggi + "\nBerat : " + this.berat);
    }
}
