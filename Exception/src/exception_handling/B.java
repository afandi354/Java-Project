package exception_handling;

public class B {
      public static void main(String[] args) {
        try
        {
            int a = 1/0;  //kesalahan karena dibagi dengan 0
            System.out.println("perintah selanjutnya");
        }
        catch(NullPointerException e)
        {
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
        }
        catch(Exception e)
        {
        }
    }
}

