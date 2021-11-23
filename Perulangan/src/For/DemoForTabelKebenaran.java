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
// Gunakan dua loop for bersarang untuk menampilkan tabel perkalian
public class DemoForTabelKebenaran {
    public static void main(String args[]){
        final int UKURAN = 15;
        for(int x =1; x<=UKURAN; x++){
            for(int y = 1; y <=UKURAN; y++){
                int z = x*y;
                if(x < 10)System.out.print(" ");
                if(x < 100)System.out.print(" ");
                System.out.print(" "+z);
            }
            System.out.println();
        }
    }
}
