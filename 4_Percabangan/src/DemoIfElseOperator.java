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
Tulislah sebuah program yang menggunakan statement 
If-Else, dimana operator || dipakai dalam kondisi
*/
import java.util.Random;

public class DemoIfElseOperator {
    public static void main(String args[]){
        Random acak = new Random();
        
        float t = acak.nextFloat();
        System.out.println("t = "+t);
        
        if(t < 0.25 || t >= 0.75)
            System.out.println("t < 0.25 atau t >= 0.75");
        else
            System.out.println("0.25 <= t < 0.75");
    }
}
