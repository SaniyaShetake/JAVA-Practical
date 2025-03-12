class Test
{
static int a=20;
static int b=30;
static int c;
static{
System.out.println("static block initalized");
c=a+b;
}
static void display()
{
System.out.println("result "+c);
}
public static void main(String[] args)
{

display();
}
}


