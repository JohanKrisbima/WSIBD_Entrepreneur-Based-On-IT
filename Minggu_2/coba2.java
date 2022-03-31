/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu_2;

/**
 *
 * @author toshiba
 */
public class coba2 {
    public static void main(String[] args) {
        String s1= "ABC";
        String s2= new String("DEF");
        String s3= "AB" + "c";
        
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s3));
        System.out.println(s3==s1);
        System.out.println(s2.compareTo(s3));
        System.out.println(s3.equals(s1));
    }
}
