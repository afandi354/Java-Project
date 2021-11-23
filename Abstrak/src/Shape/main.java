package Shape;

public class main {
    public static void main(String args[]){
        Rectangle R = new Rectangle(10, 30);
        Triangle T = new Triangle(40, 50);
        // Shape shp;
        
        //shp = R;
        System.out.println("Luas Persegi Panjang " +R.getArea());
        //shp = T;
        System.out.println("Luas Segitiga " +T.getArea());
    }
}
