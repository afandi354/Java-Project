/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fun_dy
 */
/*
Program UrutTigaAngka terlalu rumit karna menggunakan 
if-else bersarang yang terlalu berlebihan. Kode
tersebut dapat digantikan menggunakan beberapa if
secara paralel
*/
import java.util.Random;

public class IfParalel {
    public static void main(String args[]){
        Random acak = new Random();
        
        float a = acak.nextFloat();
        System.out.println("a = "+a);
        float b = acak.nextFloat();
        System.out.println("b = "+b);
        float c = acak.nextFloat();
        System.out.println("c = "+c);
        
        if(a < b && b < c) System.out.println("a < b < c");
        if(a < c && c < b) System.out.println("a < c < b");
        if(b < a && a < c) System.out.println("b < a < c");
        if(b < c && c < a) System.out.println("b < c < a");
        if(c < a && a < b) System.out.println("c < a < b");
        if(c < b && b < a) System.out.println("c < b < a");
    }
}
