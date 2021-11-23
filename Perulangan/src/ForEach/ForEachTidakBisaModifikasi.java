/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ForEach;

/**
 *
 * @author fun_dy
 */
/*
Tulislah program untuk membuktikan bahwa loop for-each
tidak dapat dipakai untuk memodifikasi suatu array
*/
public class ForEachTidakBisaModifikasi {
    public static void main(String args[]){
        int angka[] = {1,2,3,4,5,6,7,8,9,10};
        for(int x : angka){
            System.out.print(x + " ");
            x = x * 10; //tidak terpengaruh pada array angka
        }
        System.out.println();
        for(int x : angka)
            System.out.print(x+ " ");
            System.out.println();
    }
}
