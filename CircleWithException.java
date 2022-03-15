import java.util.Scanner;
public class CircleWithException {
    public double radius;
    public double area;
    public CircleWithException(){
    }
    public CircleWithException(double radius) throws IllegalArgumentException {
        if (radius <= 0){
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        else{
            this.radius = radius;
        }
    }
    
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius) throws IllegalArgumentException{
        if (radius <= 0){
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        else{
            this.radius = radius;
        }
    }
    public double getArea() throws Exception{
        double area = Math.PI * this.radius * this.radius;
        if (area > 1000) {
            throw new Exception("area cannot be bigger than 1000");
        }
        return area;
    }
    public double getDiameter(){
        return 2 * this.radius;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Create a circle with radius: ");
        double radius = input.nextDouble();
        try {
            CircleWithException circle1 = new CircleWithException(radius);
            System.out.println("Radius: " + circle1.getRadius());
            System.out.println("Area: "+ String.format("%.2f", circle1.getArea()));
          
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        input.close();
    }
}
