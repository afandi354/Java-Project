package List;

import java.util.*;
public class MyArrayList {
    public static void main(String[] args) {
        //membuat ArrayList
        ArrayList<String> af=new ArrayList<>();
        //menambahkan objek arraylist
        af.add("Afandi");
        af.add("Nur");
        af.add("Aziz");
        af.add("Thohari");
        //menampilkan isi ArrayList
        Iterator itr = af.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
