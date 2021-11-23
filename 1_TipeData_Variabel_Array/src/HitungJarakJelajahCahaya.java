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
Tulislah sebuah program untuk menghitungjarak jelajah cahaya
menggunakan variabel long
*/

public class HitungJarakJelajahCahaya {
    public static void main (String args[]){
        int kecCahaya;
        long hari;
        long detik;
        long jarak;
        
        //kecepatan cahaya dalam km per detik (pendekatan)
        kecCahaya = 340000;
        hari = 1000;
        detik = hari * 24 * 60 * 60;
        jarak = kecCahaya * detik;
        
        System.out.print("Dalam " +hari);
        System.out.print("hari, cahaya menjelajah sekitar ");
        System.out.print(jarak + " km");
    }
}
