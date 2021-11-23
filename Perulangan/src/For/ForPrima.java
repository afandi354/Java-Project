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
import java.util.Scanner;
public class ForPrima {
    public static void main(String args[]){
        int angka ;
        boolean apaPrima = true;
        System.out.print("Masukan angka = ");
        Scanner papanketik = new Scanner (System.in);
        angka = papanketik.nextInt();
        
        for(int i = 2; i <=angka/i;i++){
            if((angka % 1)==0){
                apaPrima = false;
                break;
            }
        }
        if(apaPrima) System.out.println("Prima");
        else System.out.println("Bukan Prima");
    }
}
