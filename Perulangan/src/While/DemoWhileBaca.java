package While;

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
Tulislah sebuah program yang membaca suatu masukan dari
pengguna yang akan dipakai sebagai bagian dari ekspresi
kondisional pada loop while
*/
import java.util.Scanner;

public class DemoWhileBaca {
    public static void main(String args[]){
        int kounter, angka;
        
        System.out.println("Masukan Sebuah Angka");
        Scanner papanketik = new Scanner(System.in);
        
        angka = papanketik.nextInt();
        kounter = 1;
        
        while(kounter <= angka){
            System.out.print(kounter +", ");
            kounter++;
        }
        System.out.println();
        System.out.println("Hidup Indonesia!");
    }
}
