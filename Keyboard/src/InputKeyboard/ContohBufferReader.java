package InputKeyboard;

import java.io.*;

public class ContohBufferReader {
    public static void main(String[] args) throws IOException {
        String nama;
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        System.out.print("Masukan Nama : ");
        nama = br.readLine();
        
        System.out.println("=======================");
        System.out.println("Nama Kamu adalah "+nama);
    }
}
