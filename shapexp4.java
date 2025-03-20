import java.util.Scanner;

interface  shape
{
double area();
}

 
class rectangle implements shape 
{
private double l,w;

rectangle(double l,double w)
{
this.l=l;
this.w=w;
}

public double area()
{
return l * w;
}
}
class Triangle implements shape
{
private double b,h;

Triangle(double b,double h)
{
this.b=b;
this.h=h;
}
public double area()
{
return 0.5*b*h;
}
}
public class shapexp4
{
public static void main(String[] args)
{
shape r1=new rectangle(10,9);
shape T1=new Triangle(7,9);
System.out.println("area of rectangle " +r1.area());
System.out.println("area of triangle " +T1.area());
}

}

