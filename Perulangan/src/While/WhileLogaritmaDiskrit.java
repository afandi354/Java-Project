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
Tulislah program untuk menghitung logaritma diskrit berikut :
y = logb x (buku halaman 60)
*/
import java.util.Random;
public class WhileLogaritmaDiskrit {
    public static void main(String[] args){
        Random acak = new Random();
        
        float x = acak.nextFloat();
        x = 9999*x+2 ;
        int y = 0;
        int n = 1;
        
        while(n <= x){
            n *= 2;
            ++y;
            System.out.println("n= " +n + "\t y= "+y);
        }
        --y;
        System.out.println("\nx : "+x);
        System.out.println("Logaritma Biner Diskrit atas x : "+y);
        float lgx = (float)(Math.log(x)/Math.log(2.0));
        System.out.println("Logaritma biner kontinyu atas x : "+lgx);
    }
    
}
