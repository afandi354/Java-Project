package InputKeyboard;

import java.util.Scanner;

public class VolumeTabung {
    public static final double phi = 3.14;
    public static void main(String[] args) {
        double jari2, tinggi, volume;
        
        Scanner input = new Scanner(System.in);
        System.out.println("=== Volume Tabung ===");
        System.out.print("Jari-jari : ");
        jari2 = input.nextInt();
        System.out.print("Tinggi : ");
        tinggi = input.nextInt();
        
        System.out.println("====== Volume Tabung ======");
        volume = phi * jari2 * jari2 * tinggi;
        System.out.println("Volume Tabung adalah : " +volume);
    }
}
