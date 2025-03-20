class Student
{
private int rollno;
public void setrollno(int rollno)
{
this.rollno=rollno;
}

public int getrollno()
{
return rollno;
}
}

class Test extends Student
{
private int sub1,sub2;

public void setmarks(int sub1,int sub2)
{
this.sub1=sub1;
this.sub2=sub2;
}

public int getsub1(){
return sub1;
}
public int getsub2()
{
return sub2;
}
}

interface Sports
{
int smarks=10;
void set();
}

class result extends Test implements Sports
{
private int total;
public void set()
{
total=getsub1()+getsub2()+smarks;
}
public void display()
{
System.out.println("roll no"+getrollno());
System.out.println("subject 1 marks"+getsub1());
System.out.println("subject 2 marks"+getsub2());
System.out.println("sport marks"+smarks);
System.out.println("total marks"+total);
}
}

public class exp4result
{
public static void main(String[] args)
{
result student = new result();
student.setrollno(101);
student.setmarks(80,90);
student.set();
student.display();
}
}
