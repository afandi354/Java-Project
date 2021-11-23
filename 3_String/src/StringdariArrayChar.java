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
Tulislah sebuah program yang menciptakan objek String
dari array char
*/
public class StringdariArrayChar {
    public static void main(String args[]){
        char c[] = {'A','F','A','N','D','I'};
        
        String s1 = new String (c);
        String s2 = new String (s1);
        
        System.out.println(s1);
        System.out.println(s2);
    }
}
