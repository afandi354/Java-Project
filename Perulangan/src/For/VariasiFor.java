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
Ekspresi inisialisasi atau iterasi pada loop for
bisa diabaikan. Tunjukan hal tersebut pada sebuah
program
*/
public class VariasiFor {
    public static void main(String args[]){
        boolean selesai = false;
        int i;
        i = 0;
        
        for(; !selesai; ){
            System.out.println("i bernilai "+i);
            if(i == 10 ) selesai = true;
            i++;
        }
    }    
}
