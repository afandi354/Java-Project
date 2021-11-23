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
Tulislah sebuah program untuk objek String yang merupakan
subhimpunan dari array byte
*/
public class SubStringDariArrayChar {
    public static void main(String args[]){
        byte ascii[] = {65,66,67,68,69,70};
        
        String s1 = new String(ascii);
        System.out.println(s1);
        String s2 = new String(ascii, 2 ,3);
        System.out.println(s2);
    }
}
