/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fun_dy
 */
public class DemoMethod {
    public static void main (String args[]){
        int a = 11;
        int b = 6;
        int c = minFunction(a,b);
        System.out.println("nilai terkecil = "+c);
    }
    static int minFunction(int n1, int n2){
        int min;
        if(n1 > n2)
            min = n2;
        else
            min = n1;
        
        return min;
    }
}
