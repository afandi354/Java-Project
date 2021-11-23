package Static_Inner;

public class Keluar {
    static class Kedalam{
        public static void testMethod(){
            System.out.println("Test");
        }
        
        public void testMethod2(){
            System.out.println("Test2");
        }
    }
    
    public static void main(String[] args) {
        Keluar.Kedalam.testMethod();
        
        Kedalam in = new Kedalam();
        in.testMethod2();
    }
}
