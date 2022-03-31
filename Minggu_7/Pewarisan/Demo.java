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
public class Demo {
    public static void main(String[] args) {
        A superObject = new A();
        B subObject = new B();
        
        System.out.println("SuperClass");
        superObject.x = 30;
        superObject.y = 50;
        superObject.TampilkanNilaiXY();
        
        System.out.println("Subclass");
        subObject.x = 10;
        subObject.y = 5;
        subObject.TampilkanNilaiXY();
        
        // variabel dan method tambahan yang hanya ada pada subclass
        subObject.z = 40;
        subObject.TampilkanJumlah();
    }
}
