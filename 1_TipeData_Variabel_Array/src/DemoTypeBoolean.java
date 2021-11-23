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
Tulislah sebuah program yang mendemostrasikan penggunaan
tipe boolean
*/
public class DemoTypeBoolean {
    public static void main(String args[]){
        boolean b;
        
        b = false;
        System.out.println("b adalah " +b);
        
        b=true;
        System.out.println("b adalah "+b);
        
        //suatu nilai boolean dapat mengendalikan sebuah statemen
        if(b) System.out.println("Ini dieksekusi. ");
        b=false;
        if(b) System.out.println("Ini tidak ditemukan ");
        
        //keluaran dari operator relational adalah nilai boolean
        System.out.println("10>9 adalah " +(10>9));
    }
}
