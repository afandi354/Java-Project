package Local;

class A {
    void lakukanSesuatu() {
        int nonFinalVar = 10;
        final int finalVar = 11;
        class B {
            void aksesLocalVar(){
                //EROR
                System.out.println("nonFinalVar = "+nonFinalVar);
                //TIDAK ERROR
                System.out.println("finalVar = "+finalVar);
            }
        }
        
        B b = new B();
        b.aksesLocalVar();
    }
}
