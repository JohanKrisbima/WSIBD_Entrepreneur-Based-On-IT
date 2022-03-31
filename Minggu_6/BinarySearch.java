/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu_6;

/**
 *
 * @author toshiba
 */
class binary{
    // mengembalikan nilai index x
    // pada array arr[1...r], else
    // mengembalikan nilai -1
    int BinarySrch(int arr[], int l, int r, int x){
        if(r>=1){
            int mid= 1 + (r-1)/2;
            // jika elements ditampilkan pada mid array
            if(arr[mid] == x) return mid;
            // jika element ditampilkan lebih kecil dari mid, maka
            // hanya akan ditampilkan pada bagian kiri subarray
            if(arr[mid] > x) return BinarySrch(arr, l, mid-1, x);
            //lainnya, element yang ditampilkan pada bagian kanan subarray
            return BinarySrch(arr, mid+1, r, x);
        }
        // nilai -1 diberikan jika tidak ada element yang ditampilkan pada array
        return -1;
    }
}

public class BinarySearch {
    public static void main(String[] args) {
        binary ob = new binary();
        int arr[] = {2,4,10,40,50};
        int n = arr.length;
        int x = 10;
        int result = ob.BinarySrch(arr, 0, n-1, x); 
        
        if(result == -1){
            System.out.println("Elments " + "not present");
        }
        else{
            System.out.println("Elements " + "ditemukan pada index " + result);
        }
    }
   
}
