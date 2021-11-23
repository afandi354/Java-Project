package Static_Inner;

public class Outer {
    public static void main(String[] args) {
        int x = Inner.value;
        System.out.println(x);
    }
    
    static class Inner {
        static int value = 100;
    }
}
