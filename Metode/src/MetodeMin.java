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
Tulislah sebuah program yang menguji sebuah metode min yang
menghasilkan integer minimum dari kedua argumen integernya
*/
import java.util.Random;
public class MetodeMin {
    public static void main(String args[]){
        Random acak = new Random();
        
        for(int i =0; i<5;i++){
            float x = acak.nextFloat();
            int m = Math.round(100*x);
            x = acak.nextFloat();
            int n = Math.round(100*x);
            int y = min(m, n);
            System.out.println("min("+m+","+n+")=" +y);
        }
    }
    static int min(int x, int y){
        if(x < y)return x;
        else return y;
    }
}


