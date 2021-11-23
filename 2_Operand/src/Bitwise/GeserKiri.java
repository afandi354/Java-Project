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
public class GeserKiri {
    public static void main (String args[]){
        byte a = 64 , b;
        int i;
        
        i = a << 2;
        b = (byte) (a << 2);
        
        System.out.println("Nilai awal dari a : " +a );
        System.out.println("i dan b : " +i+ ""+b);
    }
    
}
