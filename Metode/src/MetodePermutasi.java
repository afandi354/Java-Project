/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fun_dy
 */
public class MetodePermutasi {
    public static void main(String args[]){
        for(int i=0; i<=9; i++){
            for(int j=0; j<=i; j++)
                System.out.print(p(i,j)+"\t");
            System.out.println();
        }
    }
    static long p(int n, int k){
        long p =1;
        for (int i=0; i<k; i++)
            p *=n--; //p=p*n--
        return p;
    }
}
