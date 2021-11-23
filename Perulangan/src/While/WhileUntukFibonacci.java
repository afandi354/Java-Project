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
Tulislah sebuah program yang menggunakan loop while untuk
menghasilkan runtun Fibonacci yang bernilai kurang dari 1000.
*/
public class WhileUntukFibonacci {
    public static void main(String args[]){
        System.out.print(0);
        
        int fib0 = 0;
        int fib1 = 1;
        int fib2 = fib0+fib1;
        
        while (fib2 < 1000){
            fib0 = fib1;
            fib1 = fib2;
            fib2 = fib1 + fib0;
            System.out.print(", "+fib1);
        }
    }
}
