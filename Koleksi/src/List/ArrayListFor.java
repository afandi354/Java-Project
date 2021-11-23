package List;

import java.util.ArrayList;

public class ArrayListFor {
    public static void main(String[] args) {
        //menambahkan ArrayList
        ArrayList<String> ftii = new ArrayList<>();
        //menambahkan objek ke ArrayList
        ftii.add("S1 Rekayasa Perangkat Lunak");
        ftii.add("S1 Informatika");
        ftii.add("S1 Sistem Informasi");
        ftii.add("S1 Teknik Industri");
        ftii.add("S1 Desain Komunikasi Visual");
        //menampilkan isi List
        for(String obj:ftii){
            System.out.println(obj);
        }
    }
}
