/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fun_dy
 */
public class DemoEqualVersusOPerator {
    public static void main (String args[]){
        String s1 = "Haloo";
        String s2 = new String(s1);
     
        
        System.out.println(s1 + " equals " +s2+ " --> " +s1.equals(s2));
        System.out.println(s1 + " == " +s2+ " --> " + (s1 == s2));

    }
}
