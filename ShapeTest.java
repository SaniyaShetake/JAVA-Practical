import java.util.Scanner;
abstract class Shape
{
   double dim1,dim2;
   Shape(double dim1,double dim2){
  this.dim1=dim1;
  this.dim2=dim2;
}
abstract double area();
}
 

   class Rectangle extends Shape 
{
    Rectangle(double length, double width) 
    {
        super(length, width);
    }
    double area() 
    {
        return dim1 * dim2;
    }
}

class Triangle extends Shape {
    Triangle(double base, double height) {
        super(base, height);
    }
    double area() {
        return 0.5 * dim1 * dim2;
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

   
        System.out.print("Enter length and width of rectangle: ");
        Shape rectangle = new Rectangle(sc.nextDouble(), sc.nextDouble());
        System.out.println("Area of Rectangle: " + rectangle.area());


        System.out.print("Enter base and height of triangle: ");
        Shape triangle = new Triangle(sc.nextDouble(), sc.nextDouble());
        System.out.println("Area of Triangle: " + triangle.area());

        sc.close();
    }
}


