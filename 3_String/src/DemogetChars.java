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
Tulislah sebuah program yang menggunakan metode getChars
*/
public class DemogetChars {
    public static void main (String args[]){
        String s = "Ini ada demo penggunaan metode getChars";
        
        int awal = 8;
        int akhir = 21;
        char buf[] = new char[akhir - awal];
        
        s.getChars(awal, akhir, buf, 0);
        System.out.println(buf);
    }
}
