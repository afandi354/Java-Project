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
Metode equals dan equalsIgnoreCase dapat dipakai
untuk membandingkan string-string
*/
public class DemoEquals {
    public static void main (String args[]){
        String s1 = "Haloo";
        String s2 = "Haloo";
        String s3 = "Biarlah";
        String s4 = "HALLO";
        
        System.out.println(s1 + " equals " +s2+ " --> " +s1.equals(s2));
        System.out.println(s1 + " equals " +s3+ " --> " +s1.equals(s3));
        System.out.println(s1 + " equals " +s4+ " --> " +s1.equals(s4));
        System.out.println(s1 + " equalsIgnoreCase " +s4+ " --> " +s1.equalsIgnoreCase(s4));
    }
    
}
