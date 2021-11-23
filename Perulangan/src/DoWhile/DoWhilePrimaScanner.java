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

public class DoWhilePrimaScanner {
    public static void main(String args[]) {
        int angka;
      
        System.out.print("Masukan angka = ");
        Scanner papanketik = new Scanner(System.in);
        angka = papanketik.nextInt();
        boolean apaPrima;
        int d = 2;
        do {
            apaPrima = (angka % d++ != 0);
        } while (apaPrima && d < angka);

        if (apaPrima) {
            System.out.println(angka + " adalah bilangan prima");
        } else {
            System.out.println(angka + " bukan bilangan prima");
        }
    }
}
