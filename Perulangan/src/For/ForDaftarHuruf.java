/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package For;

/**
 *
 * @author fun_dy
 */
public class ForDaftarHuruf {
    public static void main(String args[]){
        for(char c = 0; c <128; c++ ){
            if(Character.isLowerCase(c))
                System.out.println("nilai : " +(int)c+ "\t Karakter : " +c );
        }
    }
}
