/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Continue;

/**
 *
 * @author fun_dy
 */
/*
Tulislah sebuah program yang menggunakan statemen continue
agar menyebabkan dua angka ditampilkan pada tiap baris
*/
public class DemoContinue {
    public static void main (String args[]){
        for(int i=0; i<10; i++){
            System.out.print(i + " ");
            if(i%2 == 0)continue;
                System.out.println("");
        }
    }
}
