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
Tulislah suatu program untuk menentukan nilai huruf,
menggunakan statemen switch
*/
import java.util.Random;

public class NilaiHurufSwitch {
    public static void main(String args[]){
        Random acak = new Random();
        
        float x = acak.nextFloat();
        System.out.println("x = " +x);
        int skor = Math.round(50*x + 50);
        System.out.println("Skor anda adalah " +skor);
        
        switch(skor/10){
            case 10 :
                System.out.println("Anda mendapat nilai A+");
                break;
            case 9 :
                System.out.println("Anda mendapat nilai A");
                break;
            case 8 :
                System.out.println("Anda mendapat nilai B");
                break;
            case 7 :
                System.out.println("Anda mendapat nilai C");
                break;
            case 6 :
                System.out.println("Anda mendapat nilai D");
                break;
            default :
                System.out.println("Anda mendapat nilai E");
        }
        if (skor >=60 && skor <100)
            if(skor %10 > 7) System.out.println("+");
            else if (skor %10 < 2)System.out.println("-");
    }
}
