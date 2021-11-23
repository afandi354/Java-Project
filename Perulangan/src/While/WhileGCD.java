/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package While;

/**
 *
 * @author fun_dy
 */
/*
Tulislah sebuah program untuk menghitung 
GCD (Greatest Common Divisior) dari dua angka yang dibangkitkan
secara acak menggunakan loop while
*/
import java.util.Random;

public class WhileGCD {
    public static void main(String [] args){
        Random acak = new Random();
        
        float x = acak.nextFloat();
        int m = Math.round(999*x + 2);
        x = acak.nextFloat();
        int n = Math.round(999*x + 2);
        System.out.println("m = "+m+ "\t\t n = "+n);
        
        while(m > 0){
            if(m < n){
                int temp = m;
                m = n;
                n = temp;
                System.out.println("m = "+m+ "\t\t n = "+n);
            }
            m -= n;
        }
        System.out.println("GCD atas m dan n adalah " +n);
    }
    
}
