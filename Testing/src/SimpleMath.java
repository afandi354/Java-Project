/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fun_dy
 */
public class SimpleMath {
    public int doAddition(int a, int b){
        return a + b;
    }
        public int doSubtraction(int a, int b){
        return a / b;
    }
    public void printAddition(int a, int b){
        System.out.println("var1 = "+a+"var2 = "+b+
                "Hasilnya adalah = "+doAddition(a,b));
    }
}
