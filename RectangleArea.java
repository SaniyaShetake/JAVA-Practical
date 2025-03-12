import java.util.Scanner;

class Area {
   
    double length, breadth;

    void setDim(double l, double b) {
        length = l;
        breadth = b;
    }

   
    double getArea() {
        return length * breadth;
    }
}

public class RectangleArea {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        Area a1 = new Area();

      
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();

   
        a1.setDim(length, breadth);

        
        System.out.println("Area of the rectangle: " + a1.getArea());

 sc.close();
    }
}
                                             