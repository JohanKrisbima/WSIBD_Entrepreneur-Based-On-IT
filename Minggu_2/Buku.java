/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu_2;

class book{
    int price;
    int pages;
    
    void set(int prices, int pages){
        this.price = prices;
        this.pages = pages;
    }
    
    public void show(){
        System.out.println("===Book Information===");
        System.out.println("Book Price : " + this.price);
        System.out.println("Book Page : " + this.pages);
    }
}

public class Buku {
    public static void main(String[] args) {
        book buku = new book();
        buku.set(10000, 30);
        buku.show();
    }
}
