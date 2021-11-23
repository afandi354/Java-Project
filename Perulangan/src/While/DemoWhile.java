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
Tulislah sebuah program yang menggunakan loop while
untuk menghitung mundur dari 10, kemudian menampilkan
sepuluh baris yang memuat "tik".
*/
public class DemoWhile {
    public static void main(String args[]){
        int n =10;
        
        while(n > 0){
            System.out.println("tik " +n);
            n--;
        }
    }
}
