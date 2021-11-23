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
Statemen Break bersifat optional. JIka anda mengabaikan
statemen break, maka eksekusi program akan dilanjutkan ke
case selanjutnya.
*/
public class BreakOptional {
    public static void main(String args[]){
        for(int i=0; i<7; i++)
            switch(i){
                case 0 :
                case 1 :
                case 2 :
                case 3 :
                case 4 :
                    System.out.println("i kurang dari 5");
                    break;
                case 5 :
                case 6 :
                case 7 :
                case 8 :
                case 9 :
                    System.out.println("i kurang dari 10");
                    break;
                default :
                    System.out.println("i bernilai lebih dari 10");
            }
    }
}
