package Throw;

public class Throw2 {
    static void kesalahan(){
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("Menangkap Kesalahan");
            throw e;
        }
    }
    public static void main(String[] args) {
        try {
            kesalahan();
        } catch (NullPointerException e) {
            System.out.println("Menangkap Kembali "+e);
        }
    }
}