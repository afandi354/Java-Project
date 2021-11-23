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
public class PenugasanBitwise {
    public static void main(String args[]){
        int a = 1;
        int b = 2;
        int c = 3;
        
        a |= 4;
        b >>= 1;
        c <<= 1;
        a ^= c;
        
        System.out.println("a = " +a);
        System.out.println("a = " +b);
        System.out.println("a = " +c);
    }
}
