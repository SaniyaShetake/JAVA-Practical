import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[2][2], B = new int[2][2], C = new int[2][2];

        System.out.println("Enter 4 elements of Matrix A:");
        for (int i = 0; i < 2; i++) 
            for (int j = 0; j < 2; j++) 
                A[i][j] = sc.nextInt();

        System.out.println("Enter 4 elements of Matrix B:");
        for (int i = 0; i < 2; i++) 
            for (int j = 0; j < 2; j++) 
                B[i][j] = sc.nextInt();

        System.out.println("\nChoose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("\nSum of Matrix:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        C[i][j] = A[i][j] + B[i][j];
                        System.out.print(C[i][j] + " ");
                    }
                    System.out.println();
                }
                break;

            case 2:
                System.out.println("\nsubstraction of matrix:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        C[i][j] = A[i][j] - B[i][j];
                        System.out.print(C[i][j] + " ");
                    }
                    System.out.println();
                }
                break;

            case 3:
                System.out.println("\n matrix multiplication:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        C[i][j] = A[i][0] * B[0][j] + A[i][1] * B[1][j];
                        System.out.print(C[i][j] + " ");
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
