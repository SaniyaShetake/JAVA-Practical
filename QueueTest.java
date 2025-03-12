class Queue {
    int arr[] = new int[5]; 
    int front = 0, rear = 0;

    void enqueue(int data) {
        if (rear == arr.length) {  
            System.out.println("Queue is full!");
        } else {
            arr[rear] = data; 
            rear++; 
        }
    }

    void dequeue() {
        if (front == rear) { 
            System.out.println("Queue is empty!");
        } else {
            System.out.println("Removed: " + arr[front]); 
            front++;
        }
    }

    void display() {
        if (front == rear) {
            System.out.println("Queue is empty!");
        } else {
            System.out.print("Queue: ");
            for (int i = front; i < rear; i++) {
                System.out.print(arr[i] + " "); 
            }
            System.out.println();
        }
    }
}

public class QueueTest {
    public static void main(String[] args) {
        Queue q = new Queue(); 
        q.enqueue(10); 
        q.enqueue(20); 
        q.enqueue(30); 
        q.display();   

        q.dequeue();   
        q.display();   
    }
}
