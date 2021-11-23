package interface2;

public class AnotherClient implements Callback{
    public void panggil1(int p) {
        System.out.println("Callback called with "+p);
        System.out.println("Another version of callback");
        System.out.println("p squared is " +(p*p));
    }
    
}
