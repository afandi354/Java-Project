/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package For;

/**
 *
 * @author fun_dy
 */
/*
Tulislah program menggunakan loop for untuk
mengakumulasi penjumlahan
*/
import java.util.Random;

public class ForAkumulasi {
    public static void main(String args[]){
        Random acak = new Random();
        
        int jum =0;
        for (int i=0; i < 5; i++){
            int x = acak.nextInt();
            jum += x;
            System.out.println("\tx = " +x+ "\t\tjum = " +jum);
        }
    }
}
