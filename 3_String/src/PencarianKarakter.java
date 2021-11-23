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
Metode indexOf dan lastIndexOf dari kelas String
*/
public class PencarianKarakter {
    public static void main(String args[]){
        String str ="Gunung sinabung meletus pada awal tahun 2014";
        System.out.println(str);
        
        int i = str.indexOf('s');
        System.out.println("Indeks pertama dari 's' adalah " +i);
        
        int j = str.indexOf('g',i+1);
        System.out.println("Indeks berikutnya dari g adalah " +j);
        
        int k = str.indexOf('a');
        System.out.println("Indeks pertama dari 'a' adalah " +k);
        
        int l = str.indexOf('a',k+1);
        System.out.println("Indeks pertama dari 'a' adalah " +l);
        
        int m = str.lastIndexOf('s');
        System.out.println("Indeks terakhir dari 's' adalah " +m);
        System.out.println(str.substring(m));
    }
}
