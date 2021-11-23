/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package For;

/**
 *
 * @author fun_dy
 */
/*
Tulislah sebuah program yang menggunakan statemen break
untuk menghentikan loop for
*/
import java.util.Random;
public class ForDanBreak {
    public static void main (String args[]){
        Random acak = new Random();
        
        float x = acak.nextFloat();
        System.out.println("x= " +x);
        int n = (int)Math.floor(101*x);
        boolean apaTidakPrima = (n < 2);
        
        for(int d = 2; d < n; d++){
            apaTidakPrima = (n%d == 0);
            if(apaTidakPrima)
                break;
        }
        if (apaTidakPrima) System.out.println(n+ " Bukan Prima");
        else System.out.println(n+ " Prima");
    }
}
