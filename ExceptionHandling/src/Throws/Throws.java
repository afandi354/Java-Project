package Throws;

public class Throws {
    void Method1() throws ArithmeticException {
        throw new ArithmeticException("Calculate Error");
    }
    void Method2() throws ArithmeticException{
        Method1();
    }
    void Method3(){
        try {
            Method2();
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Handled");
        }
    }
    public static void main(String[] args) {
        Throws obj = new Throws();
        obj.Method3();
        System.out.println("End of program");
    }
}
