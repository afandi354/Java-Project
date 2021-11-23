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
Tulislah sebuah program yang secara manual mengalokasikan
dimensi2 kedua yang berbeda ukuran
*/
public class DemoArrayDUaBedaUkuran {
    public static void main(String args[]){
        int duaD[][]=new int [4][];
        
        duaD[0]=new int[1];
        duaD[1]=new int[2];
        duaD[2]=new int[3];
        duaD[3]=new int[4];
        
        int i,j,k = 0;
        for(i=0;i<4;i++)
            for(j=0;j<i+1;j++){
                duaD[i][j]=k;
                k++;
            }
        for(i=0;i<4;i++){
            for(j=0;j<i+1;j++)
                System.out.print(duaD[i][j] + " ");
                System.out.println();
        }
    }
}
