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
Tunjukan sebuah program untuk menggunakan metode valueOf
*/
public class UjiValueOf {
    public static void main(String args[]){
        boolean b = true;
        char c = '@';
        int n = 44;
        double x = 3.1415926535897932;
        
        System.out.println("b = " +b);
        System.out.println("c = " +c);
        System.out.println("n = " +n);
        System.out.println("x = " +x);
        
        String strb = String.valueOf(b);
        String strc = String.valueOf(c);
        String strn = String.valueOf(n);
        String strx = String.valueOf(x);
        
        System.out.println("strb = " +strb);
        System.out.println("strc = " +strc);
        System.out.println("strn = " +strn);
        System.out.println("strx = " +strx);
    }    
}
