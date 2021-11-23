package Anonymous;

class A {
    public void show()
    {
        System.out.println("Menampilkan A");
    }
}

class ContohAnonymous {
    public static void main(String[] args) {
        A obj = new A(){
            @Override
            public void show()
            {
                    System.out.println("Menampilkan B");
            }
        };
        obj.show();
    }
}