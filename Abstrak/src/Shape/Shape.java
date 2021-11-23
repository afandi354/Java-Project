package Shape;

public abstract class Shape {
    private String color;
    
    abstract double getArea();
    
    @Override
    public String toString(){
        return "ini adalah bentuk";
    }
}
