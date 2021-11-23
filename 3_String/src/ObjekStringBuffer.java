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
Berikan suatu program untuk menciptakan objek-objek
dari kelas StringBufer
*/
public class ObjekStringBuffer {
    public static void main(String args[]){
        StringBuffer buf = new StringBuffer(10);
        
        System.out.println("buf = "+buf);
        System.out.println("buf.length() = "+buf.length());
        System.out.println("buf.capacity() = "+buf.capacity());
    }
}
