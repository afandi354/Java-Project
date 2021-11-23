package Vector;

import java.util.Vector;
public class Vektor {
    public static void main(String[] args) {
        //  Create Default Vector 
        Vector<String> vec = new Vector<>();
         
        //  Menambahkan value ke dalam Vector
        vec.add("Purwokerto");  //  Index 0
        vec.add("Banyumas");    //  Index 1
        vec.add("Sokaraja");    //  Index 2
        vec.add("Baturaden");   //  Index 3
        vec.add("Kebasen");     //  Index 4
        System.out.println("Vector : "+vec);
         
        //  hapus salah satu value dari Vector
        vec.removeElement("Sokaraja");
        System.out.println("Vector hapus(part1) : "+vec);
         
        //  hapus salah satu valie dari Vector berdasarkan Posisi Index
        vec.removeElementAt(2);
        System.out.println("Vector hapus(part2) : "+vec);
         
        //  mengambil salah satu value dari Vector
        String temp = vec.get(0);
        System.out.println("Vector Index 0 : "+temp);
    }
}