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
Tulislah sebuah program yang mengguanakan statement if
dimana operator || dipakai didalam kondisi yang merupakan
penggabungan beberapa ekspresi boolean
*/
public class IfOperatorGabung {
    public static void main(String args[]){
        final int PJG = 255;
        byte penyangga [] = new byte[PJG];
        System.out.print("Masukan Nama Depan Anda = ");
        
        try {
            System.in.read(penyangga, 0, PJG);
        } 
        catch (Exception e) { 
        }
        
        String nama = new String(penyangga);
        System.out.println("Hai, " +nama.trim());
        
        char c = nama.charAt(0);
        System.out.println("Huruf Pertama Pada Nama Anda adalah " +c);
        
        if(c == 'A' || c == 'I' || c == 'U' || c == 'E' || c == 'O')
            System.out.println("Yang Merupakan Huruf Vokal. ");
        
    }
}
