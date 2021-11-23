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
//memanfaatkan break untuk menghentikan perulangan
public class ForEachBreak {
    public static void main (String args[]){
        int jum = 0;
        int angka[] = {1,2,3,4,5,6,7,8,9,10};
        //menampilkan nilai2 dan penjumlahan akumulatif
        for(int x : angka){
            System.out.println("Nilai adalah : "+x);
            jum +=x;
            if(x == 5)break; //menghentikan loop ketika x bernilai 5
        }
        System.out.println("Penjumlahan atas 5 elemen pertama "+jum);
    }
    
}
