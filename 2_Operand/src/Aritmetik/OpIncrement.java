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
Tulislah sebuah program yang megilustrasikan operasi increment
a = a + 1; dapat ditulis a++;
b = b - 1; dapat ditulis b--;
*/
public class OpIncrement {
    public static void main(String args[]){
        int a =1;
        int b =2;
        int c;
        int d;
        
        c=++b;
        d=a++;
        c++;
        
        System.out.println("a = " +a);
        System.out.println("b = " +b);
        System.out.println("c = " +c);
        System.out.println("d = " +d);
    }
}
