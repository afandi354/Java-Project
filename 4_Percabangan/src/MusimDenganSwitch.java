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
Tulislah suatu program untuk memperbaiki kode pada program
'DemoIfElse' menggunakan statemen switch
*/
public class MusimDenganSwitch {
    public static void main (String args[]){
        int bulan = 4;
        String musim;
        
        switch(bulan) {
            case 1 :
            case 2 :
                musim = "Musim Dingin";
                break;
            case 3 :
            case 4 :
            case 5 :
                musim = "Musim Semi";
                break;
            case 6 :
            case 7 :
            case 8 :
                musim = "Musim Panas ";
                break;
            case 9 :
            case 10 :
            case 11 :
                musim = "Musim Gugur";
                break;
            default :
                musim = "Bulan tidak valid!";
        }
        System.out.println("April adalah "+musim);
    }
}
