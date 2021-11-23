package interface1;

public class Client implements Callback {
    public void panggil(int p){
        System.out.println("callback called with "+p);
    }
    void nonIfaceMeth(){
        System.out.println("Classes that implement interface" +
                            "may also define other members, too.");
    }
}
