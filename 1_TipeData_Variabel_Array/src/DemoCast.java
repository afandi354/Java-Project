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
Tulislah sebuah program yang mendemostrasikan berbagai
konversi tipe
*/
public class DemoCast {
    public static void main(String args[]){
        byte b;
        int i =257;
        double d = 323.142;
        
        System.out.println("\nKonversi dari integer menjadi byte");
        b= (byte) i;
        System.out.println("i dan b " +i+ " " +b);
        
        System.out.println("\nKonversi dari double menjadi integer");
        i= (int) d;
        System.out.println("d dan i " +d+ " " +i);
        
        System.out.println("\nKonversi dari double menjadi byte");
        b= (byte) d;
        System.out.println("d dan b " +d+ " " +b);
    }
}
