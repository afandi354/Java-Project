package Throws;

public class Throws1 {
    public static void main(String[] args) {
        try {
            f();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void f() throws NullPointerException, ArrayIndexOutOfBoundsException {
            throw new NullPointerException();
        }
}
