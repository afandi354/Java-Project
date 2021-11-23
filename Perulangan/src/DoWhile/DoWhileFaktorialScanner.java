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
import java.util.Scanner;

public class DoWhileFaktorialScanner {
    public static void main (String args[]){
        int angka;
        System.out.print("Masukan angka : ");
        Scanner papanketik = new Scanner(System.in);
        angka = papanketik.nextInt();
        
        long f = 1;
        int k = 1;
        
        do{
            f *=k++;
        }while(k <= angka);
        
        System.out.println(angka+ "! = " +f);
    }
}
