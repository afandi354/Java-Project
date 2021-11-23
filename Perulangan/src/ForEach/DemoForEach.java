/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ForEach;

/**
 *
 * @author fun_dy
 */
/*
Tulislah sebuah program yang menampilkan isi dari
suatu array menggunakan loop for-each
*/
public class DemoForEach {
    public static void main (String args[]){
        int angka[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int jum = 0;
        
        //menggunakan gaya for-wach
        for(int x : angka){
            System.out.println("Nilai adalah= " +x);
            jum += x;
        }
        System.out.println("Penjumlahan akumulasi = " +jum);
    }
}
