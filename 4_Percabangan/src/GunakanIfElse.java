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
Tulislah sebuah program untuk menerapkan statement if-else
*/
import java.util.Scanner;
public class GunakanIfElse {
    public static final double BIAYA_ADMIN = 8000;
    public static final double SUKU_BUNGA = 0.02;
    
    public static void main(String args[]){
        double saldo;
        System.out.print("Masukan saldo anda : Rp ");
        Scanner keyboard = new Scanner(System.in);
        saldo = keyboard.nextDouble();
        System.out.println("Saldo awal : Rp " +saldo);
        
        if(saldo >= 0)
            saldo = saldo + (SUKU_BUNGA + saldo);
        else
            saldo = saldo - BIAYA_ADMIN;
        
        System.out.println("Seteah berjalan satu bulan ");
        System.out.println("dengan pertimbangan bunga dan biaya admin");
        System.out.println("Saldo baru anda adalah Rp " +saldo);
    }
}
