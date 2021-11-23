/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perulangan;

/**
 *
 * @author fun_dy
 */
public class Kelipatan3_Tanpa_Kelipatan5 {
    public static void main (String args[]){
        int x = 0;
        while(x<=100){
            if(x%5!=0){
                System.out.println(x);
            }
        x+=3;
        }
    }
}
