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
Berikanlah sebuah program yang menunjukan beberapa sifat dari
suatu objek String
*/
public class WatakString {
    public static void main(String args[]){
        String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        System.out.println(alfabet);
        System.out.println("String ini memuat "+alfabet.length()+ " karakter.");
        System.out.println("Karakter pada indeks 7 adalah " +alfabet.charAt(7));
        System.out.println("Karakter pada karakter Z adalah " +alfabet.indexOf('Z'));
        System.out.println("Kode hash untuk String ini adalah " +alfabet.hashCode());
    }
}
