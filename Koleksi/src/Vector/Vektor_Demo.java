package Vector;

import java.util.Vector;

public class Vektor_Demo {
    public static void main(String[] args) {
        //create default vector
        Vector v = new Vector();
        
        v.add(0, 1);
        v.add(1, 2);
        v.add(2, "Compile Success");
        v.add(3, "Nol Error");
        v.add(4, "Running");
        
        System.out.println("Contoh vektor "+v );
    }
}
