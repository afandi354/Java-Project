package Local;

public class MethodLocalInnerClass {
    int num = 20;
    
    public void Demo(){
        
        //method-local inner class
        class Inner_Class {
            public void display(){
                System.out.println("Ini adalah method di inner class "+num);
            }
        } //end of inner class
        
        //accessing the inner class
        Inner_Class inClass = new Inner_Class();
        inClass.display();
    }
    
    public static void main(String[] args) {
        MethodLocalInnerClass obj = new MethodLocalInnerClass();
        obj.Demo();
    }
}
