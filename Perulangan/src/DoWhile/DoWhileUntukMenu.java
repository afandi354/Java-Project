/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoWhile;

/**
 *
 * @author fun_dy
 */
/*
Tulislah sebuah program yang menggunakan loop do while
untuk menproses seleksi pada suatu menu
*/
public class DoWhileUntukMenu {
    public static void main (String args[]) throws java.io.IOException{
        char pilihan;
                do{
                    System.out.println("Silahkan pilih : ");
                    System.out.println("1. If");
                    System.out.println("2. Switch");
                    System.out.println("3. While");
                    System.out.println("4. do-while");
                    System.out.println("5. For");
                    System.out.println("Pilih Salah Satu :");
                    pilihan = (char) System.in.read();
                }
                while(pilihan < '1' || pilihan > '5');
                System.out.println("\n");
                
                switch(pilihan){
                    case '1':
                        System.out.println("Statement IF");
                        System.out.println("if(kondisi) statemen; ");
                        System.out.println("else statemen");
                        break;
                    case '2':
                        System.out.println("Statement Switch");
                        System.out.println("switch(ekspresi) { ");
                        System.out.println("case konstanta :");
                        System.out.println("runtun statemen");
                        System.out.println("break; ");
                        System.out.println("// ...");
                        System.out.println("}");
                        break;
                }
    }
    
}
