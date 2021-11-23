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
Berikanlah suatu program untuk mengilustrasikan fleksibilitas
objek2 dari kelas StringBuffer
*/
public class ModifikasiObjekStringBuffer {
    public static void main (String args[]){
        StringBuffer buf = new StringBuffer(10);
        
        buf.append("Hari ini");
        System.out.println("buf = " +buf);
        System.out.println("buf.length() = " +buf.length());
        System.out.println("buf.capacity() = " +buf.capacity());
        
        buf.append(" Mendung Menyelimuti");
        System.out.println("buf = " +buf);
        System.out.println("buf.length() = " +buf.length());
        System.out.println("buf.capacity() = " +buf.capacity());
        
        buf.append(" Matahari");
        System.out.println("buf = " +buf);
        System.out.println("buf.length() = " +buf.length());
        System.out.println("buf.capacity() = " +buf.capacity());
    } 
}
