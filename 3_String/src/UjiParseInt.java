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
Berikan suatu program untuk mengubah string menjadi
nilai bertipe primitif menggunakan parseInt
*/
public class UjiParseInt {
    public static void main(String args[]){
        String hariIni = "Juni 07, 2017";
        String stringHariIni = hariIni.substring(6,7);
        
        int hariIniInt= Integer.parseInt(stringHariIni);
        int mingguDepanInt = hariIniInt + 7 ;
        
        String mingguDepan = hariIni.substring(0 ,5) + mingguDepanInt + hariIni.substring(7);
        System.out.println("Tanggal hari ini adalah " +hariIni);
        System.out.println("Hari ini adalah " +stringHariIni);
        System.out.println("Minggu depan adalah hari " +mingguDepanInt);
        System.out.println("Tanggal minggu depan adalah " +mingguDepan);
    }
}
