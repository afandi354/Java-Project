package Local;

public class Outer {
    private int size = 5;
    
    public  Object makeTheInner(int localVar){
        final int finalLocalVar = 6;
        
        //mendeklarasikan class didalam method
        class Inner {
            public String toString(){
                return ("#<Inner Size = " +size+ 
                        // "localVar = "+localVar + // ERROR: ILLEGAL
                        "finalLocalVar = "+finalLocalVar+ ">");
            }
        }
        return new Inner();
    }
    public static void main(String [] args){
        Outer outer = new Outer();
        Object obj = outer.makeTheInner(47);
        System.out.println("The object is "+obj);
    }
}
