package Figure;

class AbstractAreas{
  public static void main(String[] args) {
    // Figure f = new Figure(10, 10) {}; //illegal
    Rectangle r = new Rectangle(8, 9);
    Triangle t = new Triangle(4, 9);
    Figure figref; //this is OK, no object is created

    figref = r;
    System.out.println("Area is " +figref.area());

    figref = t;
    System.out.println("Area is " +figref.area());
  }
}
