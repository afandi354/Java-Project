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

public class BanyakAnak {
    public static void main(String args[]){
        int jmlBayi;
        System.out.print("Masukan Jumlah Bayi : ");
        Scanner papanketik = new Scanner (System.in);
        jmlBayi = papanketik.nextInt();
        
        switch(jmlBayi){
            case 1 :
                System.out.println("Selamat !");
                break;
            case 2 :
                System.out.println("Waow, Kembar !");
                break;
            case 3 :
                System.out.println("Waow, Kembar Tiga !");
                break;
            case 4 :
            case 5 :
                System.out.println("Hebat !");
                System.out.println(jmlBayi+ " Bayi !");
                break;
            default :
                System.out.println("Saya tidak percaya !");
        }
    }
}
