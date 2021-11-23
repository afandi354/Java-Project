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
Metode setLength dan reverse dapat dipakai untuk menetapkan
panjang dan membalikan objek2 StringBuffer
*/
public class ujiSetLength {
    public static void main(String args[]){
        StringBuffer buf = new StringBuffer("mari sirami cinta yang tulus di dalam hati.");
        
        System.out.println("buf = " +buf);
        System.out.println("buf.length() = " +buf.length());
        System.out.println("buf.capacity() = " +buf.capacity());
        
        buf.setLength(60);
        System.out.println("buf = " +buf);
        System.out.println("buf.length() = " +buf.length());
        System.out.println("buf.capacity() = " +buf.capacity());
        
        buf.setLength(30);
        System.out.println("buf = " +buf);
        System.out.println("buf.length() = " +buf.length());
        System.out.println("buf.capacity() = " +buf.capacity());
        
        buf.reverse();
        System.out.println("buf = " +buf);
        System.out.println("buf.length() = " +buf.length());
        System.out.println("buf.capacity() = " +buf.capacity());
    }
    
}
