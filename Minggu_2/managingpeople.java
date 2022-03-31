/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu_2;

public class managingpeople {
    
    public static void main(String[] args) {
        
        person person1 = new person("Johan", 19);
        person person2 = new person("Ilham", 20);
        
        if(person1.getAge()==person2.getAge()){
            System.out.println(person1.name + " seumuran dengan " + person2.name);
        }
        else{
            System.out.println(person1.name + " tidak seumuran dengan " + person2.name);
        }
    }
}
