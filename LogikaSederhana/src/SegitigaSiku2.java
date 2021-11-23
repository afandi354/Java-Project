/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fun_dy
 */
import java.util.Scanner;

public class SegitigaSiku2 {
    public static void main (String args[]){
        int a, b, c;
        Scanner masuk = new Scanner(System.in);
        
        System.out.println("Menghitung segitiga siku-siku");
        
        System.out.print("maukan nilai a = ");
        a = masuk.nextInt();
        System.out.print("maukan nilai b = ");
        b = masuk.nextInt();
        
        System.out.println("\n");
        c = (a*a)+ (b*b);
        
        System.out.print("Panjang sisi miring segitiga adalah = " +Math.sqrt(c));
    }
}
