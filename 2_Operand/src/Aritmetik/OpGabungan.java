/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aritmetik;

/**
 *
 * @author fun_dy
 */
/*
Dalam java a = a+5; dapat ditulis a + = 5;
Dalam java a = a%2; dapat ditulis a % = 2;
*/
public class OpGabungan {
    public static void main(String args[]){
        int a = 1;
        int b = 2;
        int c = 3;
        a +=5;
        b *=4;
        c +=a * b;
        c %=6;
        
        System.out.println("a = " +a);
        System.out.println("b = " +b);
        System.out.println("c = " +c);
    }
}
