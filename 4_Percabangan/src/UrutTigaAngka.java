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
Tulislah sebuah program menggunakan if-else bersarang
untuk menentukan urutan dari 3 angka
*/
import java.util.Random;

public class UrutTigaAngka {
    public static void main(String arg[]){
        Random acak = new Random();
        
        float a = acak.nextFloat();
        System.out.println("a = "+a);
        float b = acak.nextFloat();
        System.out.println("b = "+b);
        float c = acak.nextFloat();
        System.out.println("c = "+c);
        
        if (a<b)
            if(b<c) System.out.println("a < b < c");
            else
                if(a<c) System.out.println("a < c < b");
                else System.out.println("c < a < b");
        else
            if(a<c)System.out.println("b < a < c");
            else
                if(b<c)System.out.println("b < c < a");
                else System.out.println("c < a < b");
    }
}
