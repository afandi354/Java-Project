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
import java.util.Scanner;

public class ForKeprimaan {
    public static void main(String args[]){
        int x;
        System.out.print("x = ");
        Scanner papanketik = new Scanner(System.in); 
        x = papanketik.nextInt();
        
        for(int d=2; d < x; d++)
            if(x%d ==0){
                System.out.println(x+ " bukan prima.");
                return;
            }
        System.out.println(x+ " prima.");
    }
}
