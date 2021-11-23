package Throw;

public class Throw3 {
    public static void methodlain(){
        try {
            throw new ArrayIndexOutOfBoundsException(1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Penanganan Eksepsi di method lain");
            throw e;
        }
    }
    public static void main(String[] args) {
        try {
            methodlain();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Penanganan Eksepsi di Method Main");
        }
    }
}
