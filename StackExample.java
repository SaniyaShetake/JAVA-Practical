class Stack {
    int[] stack = new int[5];
    int top = 0;

 
    void push(int value) {
        stack[top] = value;
        top++;
    }

  
    int pop() {
        top--;
        return stack[top];
    }
}

public class StackExample {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(10); 
        s1.push(20); 
        s1.push(30); 
        s1.push(9);
s1.push(23);



        System.out.println(s1.pop()); 
        System.out.println(s1.pop()); 
         System.out.println(s1.pop()); 
System.out.println(s1.pop()); 
System.out.println(s1.pop()); 

    }
}
