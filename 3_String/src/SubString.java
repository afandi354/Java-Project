/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fun_dy
 */
public class SubString {
    public static void main(String args[]){
        String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(alfabet);
        System.out.println("Substring dari index 4 sampai 9 adalah " +alfabet.substring(4, 9));
        System.out.println("Substring dari index 5 sampai 5 adalah " +alfabet.substring(5, 5));
        System.out.println("Substring dari index 4 sampai 5 adalah " +alfabet.substring(4, 5));
        System.out.println("Substring dari index 0 sampai 10 adalah " +alfabet.substring(0, 10));
        System.out.println("Substring dari index 7 sampai akhir adalah " +alfabet.substring(7));
    }
}
