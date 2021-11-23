package pkgfinal;

import java.util.Scanner;

public class Final {
    public static final int BUKA_FILE = 1;
    public final int UBAH_FILE = 2;
    
    public static void main(String[] args) {
        Final df = new Final();
        Scanner s = new Scanner(System.in);
        System.out.println("Menu File");
        System.out.println("1. Buka File");
        System.out.println("2. Ubah File");
        System.out.println("Pilihan : ");
        int pil = s.nextInt();
        if(pil==Final.BUKA_FILE){
            System.out.println("Membuka Isi File");
        }else if(pil==df.UBAH_FILE){
            System.out.println("Mengubah Isi File");
        }else{
            System.out.println("Tidak ada pilihan");
        }
    }
    
}
