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
Buat sebuah program yang mengilustrasikan increment dan decrement
*/
public class OpIncDinc {
    public static void main (String args[]){
        char c = 'R';
        byte j = 127;
        short k = 32767;
        
        System.out.println("c = " +c);
        ++c;
        System.out.println("c = " +c);
        ++c;
        System.out.println("c = " +c);
        System.out.println("j = " +j);
        --j;
        System.out.println("j = " +j);
        ++j;
        System.out.println("j = " +j);
        System.out.println("k = " +k);
        k -= 4;
        System.out.println("k = " +k);
        k +=5;
        System.out.println("k = " +k);
    }
}
