package InputKeyboard;

import java.util.Scanner;

public class DataMahasiswa {
    public static void main(String[] args) {
        String nama, alamat;
        float ipk;
        
        Scanner input = new Scanner(System.in);
        System.out.println("## Data Mahasiswa IT Telkom ##");
        System.out.print("Nama : ");
        nama = input.nextLine();
        System.out.print("Alamat : ");
        alamat = input.nextLine();
        System.out.print("IPK : ");
        ipk = input.nextFloat();
        
        //Menampilkan apa yang sudah disimpan di variabel
        System.out.println("====================================");
        System.out.println("Nama mahasiswa : " +nama);
        System.out.println("Alamat : " +alamat);
        System.out.println("IPK : "+ipk);
    }
}
