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
Tulislah program menggunakan array dua dimensi
*/
public class DemoArrayDuaDimensi {
    public static void main (String arg[]){
        int duaD[][]= new int[4][5];
        int i, j, k = 0 ;
        
        for(i=0;i<4;i++)
            for(j=0;j<5;j++){
                duaD[i][j] = k;
                k++;
            }
        for(i=0;i<4;i++){
            for(j=0;j<5;j++)
                System.out.print(duaD[i][j]+ " ");
            System.out.println();
        }
    }
}
