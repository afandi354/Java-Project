package exception_handling;

public class C {
    public static void main(String[] args) {
        try 
        {
            int a = 1/0;
        } 
        catch (Exception e)
        {
            System.out.println("ada Kesalahan yang Muncul");
        }
        finally 
        {
            System.out.println("Terima Kasih telah menjalankan Program");
        }
    }
}
