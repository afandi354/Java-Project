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
Berikanlah suatu program untuk mengkonversi objek StringBuffer 
menjadi objek string menggunakan metode toString
*/
public class StringBufferMenjadiString {
    public static void main(String args[]){
        StringBuffer buf = new StringBuffer("Ia tak ingin kau bersedih");
        
        System.out.println("buf = " +buf);
        System.out.println("buf.length() = " +buf.length());
        System.out.println("buf.capacity() = " +buf.capacity());
        
        String str = buf.toString();
        System.out.println("Str = "+str);
        System.out.println("str.length() = " +str.length());
        
        buf.append(" " +str.substring(0 ,17)+"bila engkau sedang sendiri");
        System.out.println("buf = " +buf);
        System.out.println("buf.length() = " +buf.length());
        System.out.println("buf.capacity() = " +buf.capacity());
        System.out.println("Str = "+str);
    }
}
