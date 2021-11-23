package Figure;

public abstract class Figure {
  double dim1;
  double dim2;

  Figure(double a, double b){
    dim1 = a;
    dim2 = b;
  }
  //area ini sekarang adalah abstract method
  abstract double area();
}