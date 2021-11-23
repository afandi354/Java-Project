package exception_handling;

public class A {
    public static void main(String[] args) {
        try 
        {
            int a = 1/0; //kesalahan karena dibagi dengan 0
            System.out.println("Perintah selanjutnya");
        } 
        catch (Exception kesalahan) 
        {
            System.err.println(kesalahan);
        }
    }
}
