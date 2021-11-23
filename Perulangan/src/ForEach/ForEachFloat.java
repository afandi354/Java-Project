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
Dimisalkan anda memiliki sebuah array float yang berisi
nilai2 acak, gunakan loop for-each untuk menampilkan
tiap elemen array tersebut
*/
import java.util.*;
public class ForEachFloat {
     public static void main (String args[]){
        Random acak = new Random(47);
        
        float f[] = new float[10];
        for(int i =0;i<10;i++){
            f[i] = acak.nextFloat();
        }   
        for(float x : f){
            System.out.println(x);
        }
        
    }
}
