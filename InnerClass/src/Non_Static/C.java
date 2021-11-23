package Non_Static;

class A {
    class B {
        void sebuahMethodPadaB(){
            System.out.println("Hello, Saya method pada kelas B");
            System.out.println("Kelas B berada didalam kelas A");
        }
    }
    void sebuahMethodPadaA(){
        System.out.println("Hello, Saya method kelas A");
        System.out.println("Saya membuat object dari inner class B");
    }
}
public class C {
    public static void main(String[] args) {
        A.B b = new A().new B();
        b.sebuahMethodPadaB();
        A a = new A();
        a.sebuahMethodPadaA();
    }
}

