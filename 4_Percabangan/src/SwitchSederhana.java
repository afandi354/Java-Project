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
Tulislah sebuah program yang mengilustrasikan penggunaan 
sederhana atas statemen SWITCH
*/
public class SwitchSederhana {
    public static void main (String args[]){
        for(int i=0; i<6; i++)
            switch(i){
                case 0:
                    System.out.println("i adalah nol.");
                    break;
                case 1:
                    System.out.println("i adalah satu.");
                    break;
                case 2:
                    System.out.println("i adalah dua.");
                    break;
                case 3:
                    System.out.println("i adalah tiga.");
                    break;
                default:
                     System.out.println("i lebih dari tiga.");
            }
    }
}
