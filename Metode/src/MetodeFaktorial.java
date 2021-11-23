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
Tulislah sebuah program yang memiliki sebuah metode bernama f
dan mengimplementasikan fungsi faktoial. Metode tersebut juga
memiliki satu variabel lokal f bertipe long
*/
public class MetodeFaktorial {
    public static void main (String args[]){
        for(int i = 0;i<9;i++)
            System.out.println("f("+i+")="+f(i));
        }
        static long f (int n){
            long f = 1;
            while(n > 1)
                f *= n--; //f = f * n--
            return f;
    }
}
