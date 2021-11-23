package Throws;

public class Throws2 {
    void method() throws ArithmeticException {
        throw new ArithmeticException ("Arithmetic Exception Occured");
    }
}

class Example1 {
    public static void main(String[] args) {
        Throws2 obj = new Throws2();
        obj.method();
        System.out.println("End Of Program");
    }
}