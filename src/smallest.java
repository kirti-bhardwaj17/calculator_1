import java.util.Scanner;

public class smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input three numbers
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter second number:");
        int num2 = sc.nextInt();

        System.out.println("Enter third number:");
        int num3 = sc.nextInt();

        // Find the smallest number
        int smallest;
        if (num1 < num2) {
            if (num1 < num3) {
                smallest = num1;
            } else {
                smallest = num3;
            }
        } else {
            if (num2 < num3) {
                smallest = num2;
            } else {
                smallest = num3;
            }
        }

        System.out.println( smallest);
    }
}