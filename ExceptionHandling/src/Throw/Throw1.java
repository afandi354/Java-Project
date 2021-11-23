package Throw;

public class Throw1 {
    public static void main(String[] args) {
        try 
        {
            throw new Exception("Kesalahan Terjadi");
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}
