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
Program mengurutkan array yang memuat string-string
Program menggunakan metode compareTo
*/
public class DemocompareTo {
    static String arr[] ={
            "Anda","bila", "senyum","tawa", "minat","membawaku","alam","kelabu",
            "semakin","percaya","dinda","senja","terang","kenangan","berkesan","kekal"
            };
     public static void main(String args[]){
        for(int j=0; j< arr.length; j++){
            for(int i = j+1; i<arr.length; i++){
                if(arr[i].compareTo(arr[j])<0){
                    String t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t;
                }
            }
            System.out.println(arr[j]);
        }
    }
}
