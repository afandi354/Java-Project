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
Berikanlah suatu program yang bisa membaca masukan angka dan 
string dari papan ketik oleh pengguna
*/
import java.util.Scanner;

public class StringMasukan {
    public static void main (String args[]){
        Scanner papanketik = new Scanner(System.in);
        System.out.println("Masukan data angka bulat");
        System.out.println("Dipisahkan dengan spasi : ");
        
        int n1, n2;
        n1 = papanketik.nextInt();
        n2 = papanketik.nextInt();
        System.out.println("Anda Memasukan angka " +n1+ " dan " +n2);
        System.out.println("Selanjutkan masukan 2 angka pecahan :");
        System.out.println("Dipisahkan dengan spasi");
        
        double d1, d2;
        d1 = papanketik.nextDouble();
        d2 = papanketik.nextDouble();
        System.out.println("Anda Memasukan angka " +d1+ " dan " +d2);
        System.out.println("Selanjutkan masukan dua kata : ");
        
        String s1, s2;
        s1 = papanketik.next();
        s2 = papanketik.next();
        System.out.println("Anda Memasukan \"" +s1+ "\" dan \"" +s2+ "\"");
        
        s1 = papanketik.nextLine(); // untuk menggantikan '\n'
        System.out.println("Selanjutkan masukan sebuah baris teks : ");
        
        s1 = papanketik.nextLine(); // untuk menggantikan '\n'
        System.out.println("Anda memasukan : \"" +s1+ "\"");
        
    }
}
