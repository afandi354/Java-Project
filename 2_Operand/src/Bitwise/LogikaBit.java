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
public class LogikaBit {
    public static void main(String args[]){
        String biner [] ={
            "0000","0001","0010","0011","0100","0101","0110","0111",
            "1000","1001","1010","1011","1100","1101","1110","1111"    
        };
        
        int a =3;
        int b =6;
        int c =a | b;
        int d =a & b;
        int e =a ^ b;
        int f =(~a & b) | (a & ~b);
        int g =~a & 0x0f;
        
        System.out.println("a                   = " +biner[a]);
        System.out.println("b                   = " +biner[b]);
        System.out.println("a | b               = " +biner[c]);
        System.out.println("a & b               = " +biner[d]);
        System.out.println("a ^ b               = " +biner[e]);
        System.out.println("(~a & b) | (a & ~b) = " +biner[f]);
        System.out.println("~a                  = " +biner[g]);
      
    }
}
