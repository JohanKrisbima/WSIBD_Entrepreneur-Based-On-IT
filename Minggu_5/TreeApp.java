/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu_5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author toshiba
 */
public class TreeApp {
    public static void main(String[] args) throws IOException{
        int value;
        String data;
        Tree theTree = new Tree();
        theTree.insert(50, "Johan");
        theTree.insert(25, "Bima");
        theTree.insert(75, "Boby");
        theTree.insert(12, "Asmiranti");
        theTree.insert(37, "Ilham");
        theTree.insert(43, "Liwa");
        theTree.insert(30, "Okta");
        theTree.insert(33, "Dyion");
        theTree.insert(97, "Lya");
        theTree.insert(93, "Nabila");
        theTree.insert(97, "Rico");
        
        while (true) {            
            System.out.print("Enter first letter of show "
                    + "insert, find, Deletem or traverse: ");
            int choice = getChar();
            switch(choice){
                case 's':
                    theTree.displayTree();
                    break;
                case 'i':
                    System.out.print("Enter value and data to insert: ");
                    value = getInt();
                    data = getString();
                    theTree.insert(value, data);
                    break;
                case 'f':
                    System.out.print("Enter value to find: ");
                    value = getInt();
                    Node found = theTree.find(value);
                    if (found != null) {
                        System.out.print("found: ");
                        found.displayNode();
                        System.out.println("\n");
                    }else{
                        System.out.println("Could not find "+ value );
                    }
                    break;
                case 'd':
                    System.out.println("Enter value to delete: ");
                    value = getInt();
                    boolean didDelete = theTree.delete(value);
                    if (didDelete) {
                        System.out.println("Deleted "+value);
                    }else{
                        System.out.println("Cold not delete "+ value);
                    }
                    break;
                case 't':
                    System.out.println("Enter type 1, 2 or 3: ");
                    value = getInt();
                    theTree.traverse(value);
                    break;
                default:
                    System.out.println("Invalid entry ");
            }
        }
    }
    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
    
     public static char getChar() throws IOException {
         String s = getString();
         return s.charAt(0);
     }
     
     public static int getInt() throws IOException {
         String s = getString();
         return Integer.parseInt(s);
     }
}

