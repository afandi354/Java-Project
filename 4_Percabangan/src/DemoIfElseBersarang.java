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
Tulislah sebuah program menggunakan if-else bersarang
untuk menentukan nilai huruf dari ujian mahasiswa
*/
import java.util.Scanner;

public class DemoIfElseBersarang {
    public static void main(String args[]){
    int skor;
    char nilai;
    
    System.out.print("Masukan skor anda : ");
    Scanner papanketik = new Scanner(System.in);
    skor = papanketik.nextInt();
    
    if(skor >= 90)
        nilai ='A';
    else if (skor >= 80)
        nilai ='B';
    else if (skor >= 70)
        nilai ='C';
    else if (skor >= 60)
        nilai ='D';
    else
        nilai ='F';
    System.out.print("\n");
    System.out.println("Skor = " +skor);
    System.out.println("Nilai = " +nilai);
    }    
}
