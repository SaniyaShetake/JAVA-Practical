import java.util.Scanner;

class Student {
    int rollno;

    void input(Scanner sc) {
        System.out.println("Enter roll no: ");
        rollno = sc.nextInt();
        sc.nextLine(); // Consume leftover newline to prevent input skipping
    }

    void display() {
        System.out.println("Roll No: " + rollno);
    }
}

class Test extends Student {
    String sub1, sub2;

    void inputmarks(Scanner sc) {
        System.out.println("Enter Subject 1: ");
        sub1 = sc.nextLine();  // Reads subject 1 properly
        System.out.println("Enter Subject 2: ");
        sub2 = sc.nextLine();  // Reads subject 2 properly
    }

    void displaymarks() {
        System.out.println("Subject 1: " + sub1);
        System.out.println("Subject 2: " + sub2);
    }
}

class Result extends Test {
    void displayResult() {
        System.out.println("\n--- Student Marksheet ---");
        display();        
        displaymarks();   
       
    }
}
public class Multilevelex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Result r = new Result();  
        r.input(sc);              
        r.inputmarks(sc);        

        r.displayResult();       

        sc.close();
    }
}
