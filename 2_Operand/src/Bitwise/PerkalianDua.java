/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bitwise;

/**
 *
 * @author fun_dy
 */
//Pergeseran kiri sebagai cara cepat untuk mengalikan dengan 2

public class PerkalianDua {
    public static void main(String args[]){
        int i;
        int angka = 0xFFFFFFE;
            
        for(i=0;i<4;i++){
            angka = angka << 1;
            System.out.println(angka);
        }
    }
    
}
