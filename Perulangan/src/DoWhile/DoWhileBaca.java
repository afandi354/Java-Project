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
/*
Tulislah program versi do-while untuk membaca inputan
*/
import java.util.Scanner;

public class DoWhileBaca {
    public static void main (String args[]){
        int kounter, angka;
        
        System.out.print("Masukan sebuah angka : ");
        Scanner papanketik = new Scanner(System.in);
        angka = papanketik.nextInt();
        kounter = 1;
        
        do {
            System.out.print(kounter +", ");
            kounter++;
        } while(kounter <=angka);
        System.out.println();
        System.out.println("Hidup Indonesia!!");
    }
}
