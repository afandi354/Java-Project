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
Tulislah sebuah program yang menggunakan objek dari kelas
Random untuk membangakitkan dua integer acak
*/
import java.util.Random;

public class BangkitAcak2 {
    public static void main(String args[]){
        Random random = new Random();
        int m = random.nextInt();
        
        System.out.println("m = " +m);
        int n = random.nextInt();
        System.out.println("n = " +n);
        
        if(m<n)
            System.out.println("Nilai minimum adalah = " +m);
        else
            System.out.println("Nilai maksimum adalah = " +n);
    }
}
