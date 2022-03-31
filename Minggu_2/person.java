
package Minggu_2;

public class person {
    
    String name;
    int age;
    
    person(String name, int age){
        this.name = name;
        this.age = age;
    } 
     
    String getName(){
        return this.name;
    }
    
    int getAge(){
        return this.age;
    }
    
    void setAge(int value){
        this.age = value;
    }
}
