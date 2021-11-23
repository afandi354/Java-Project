package While;

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
Tubuh loop while (atau loop Java lainnya) bisa kosong. Ini karena
statemen null (yang hanya merupakan titik-koma) secara sintaks valid
pada java. Tulislah program untuk mengilustrasikan situasi ini
*/
public class TubuhWhileKosong {
    public static void main(String args[]){
        int i , j;
        i = 100;
        j = 200;
        
        //mencari titik tengah antara i dan j
        while ( ++i < --j ); //tidak ada tubuh di loop ini
        
        System.out.println("Titik-tengah adalah " +i);
    }
}
