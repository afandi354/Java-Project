package interface2;

public class TestIface2 {
    public static void main(String[] args) {
        Callback c = new AnotherClient();
        AnotherClient ob = new AnotherClient();    
        
        c.panggil1(33);
        c = ob;
        c.panggil1(34);
    }  
}
