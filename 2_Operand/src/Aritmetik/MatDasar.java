/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aritmetik;

/**
 *
 * @author fun_dy
 */
/*
Buatlah sebuah program yang mendemostrasikan operator2 aritmatik
Program tersebut juga perlu mengilustrasikan perbedaan antara
pembagian titik-mengambang dan pembagian integer
*/
public class MatDasar {
    public static void main (String args[]){
        //Aritmetik menggunakan integer
        System.out.println("Aritmetik integer Arithmetic ");
        int a = 1+1;
        int b = a * 3;
        int c = b / 4;
        int d = c - a;
        int e = -d;
        
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        System.out.println("c= "+c);
        System.out.println("d= "+d);
        System.out.println("e= "+e);
        
        //Aritmetik menggunakan Double
        System.out.println("\nAritmetik titik mengambang ");
        double da = 1 + 1;
        double db = da * 3;
        double dc = db / 4;
        double dd = dc - da;
        double de = -dd;
        
        System.out.println("da= "+da);
        System.out.println("db= "+db);
        System.out.println("dc= "+dc);
        System.out.println("dd= "+dd);
        System.out.println("de= "+de);
    }
    
}
