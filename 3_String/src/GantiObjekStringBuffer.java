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
Berikan suatu program untuk mengganti objek2
StringBuffer menggunakan metode setChartAt dan insert
*/
public class GantiObjekStringBuffer {
    public static void main(String args[]){
        StringBuffer buf = new StringBuffer();
        
        buf.append("Hari ini awan menyelimuti mentari");
        System.out.println("buf = " +buf);
        System.out.println("buf.length() = " +buf.length());
        System.out.println("buf.capacity() = " +buf.capacity());
        
        buf.setCharAt(11, 'w');
        System.out.println("buf = " +buf);
        
        buf.setCharAt(12, '0');
        System.out.println("buf = " +buf);
        
        buf.insert(13, 'r');
        System.out.println("buf = " +buf);
    }
}
