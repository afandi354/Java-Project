/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fun_dy
 */
public class MetodeKubik {
    public static void main(String args){
        for(int i = 0; i<6; i++)
            System.out.println(i+ "\t" +kubik(i));
            
    }
     static int kubik(int n){
        return n*n*n;
    }
}
