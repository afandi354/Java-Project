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
Tulislah sebuah program untuk mendemostrasikan skop-skop variabel
*/
public class DemoSkopVariabel {
    public static void main (String args[]){
        int x; //diketali oleh semua method di dalam main
        x = 10;
        
        if(x==10){ //mulai skop baru
            int y = 20; //hamuya dikenali oleh skop if
            System.out.println("x dan y : " +x+ " " +y );
            x= y+2;
        }
        //y = 100; y sudah tidak dikenali
        //x masih dikenali disini
        System.out.println("x adalah : " +x);
    }
}
