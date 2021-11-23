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
Tulislah sebuah program menggunakan sebuah array satu dimensi
*/
public class DemoArraySatuDimensi {
    public static void main (String args[]){
        double arrayAngka[] = {10.1, 11.2, 12.3, 13.4, 14.5};
        double hasil =0;
        int i;
        
        for(i=0; i<5; i++)
            hasil = hasil + arrayAngka[i];
            System.out.println("Rerata adalah " + hasil/5);
        
    }
}
