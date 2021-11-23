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
import java.util.Random;
public class DemoForHitung {
    public static void main(String args[]){
        Random acak = new Random();
        
        float x = acak.nextFloat();
        System.out.println("x = "+x);
        int n = (int)Math.floor(99*x+2);
        System.out.println("n = "+n);
        int jum = 0;
        
        for(int i = 1; i <= n; i++)
            jum += i+1;
        
        int formula = n*(n+1)*(2*n+1)/6;
        System.out.println("jum = "+jum);
        System.out.println("n*(n+1)*(2*n+1)/6 = "+formula);
    }
}
