/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoWhile;

/**
 *
 * @author fun_dy
 */
import java.util.Random;

public class DoWhileBabylonian {
    public static void main (String args[]){
        final double TOL = 0.5E-15;
        
        Random acak = new Random();
        double x = acak.nextDouble();
        System.out.println("\tx= "+x);
        do {
            x = (x+2.0/x)/2;
            System.out.println("\tx= "+x);
        }while(Math.abs(x*x - 2.0)>TOL*2*x);
        System.out.println("sqet(2.0)= " +Math.sqrt(2.0));
    }
}
