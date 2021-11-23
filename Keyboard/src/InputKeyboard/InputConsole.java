package InputKeyboard;

import java.io.*;

public class InputConsole {
    public static void main(String[] args) {
        String nama;
        int usia;

        Console con = System.console();

        System.out.println("Inputkan nama : ");
        nama = con.readLine();
        System.out.println("Inputkan usia : ");
        usia = Integer.parseInt(con.readLine());

        System.out.println("Nama kamu adalah : "+nama);
        System.out.println("Saat ini berusia : "+usia+ " Tahun");
    }
}
