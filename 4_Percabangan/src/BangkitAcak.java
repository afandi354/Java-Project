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
Tulislah sebuah program untuk membangkitkan angka2
secara acak. Program kemudian melaporkan bila integer
yang dihasilkan adalah angka negatif
*/
import java.util.Random;
public class BangkitAcak {
    public static void main(String args[]){
        Random acak = new Random();
        
        int n = acak.nextInt();
        System.out.println("n = " +n);
        
        if(n < 0)
            System.out.println("****n < 0");
        
         System.out.println("Selamat Jalan");
    }
}
