import java.util.Scanner;

public class division {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=sc.nextInt();
        System.out.println("Enter second number");
        int num2=sc.nextInt();
        int q=num1/num2;
        int r=num1%num2;
        System.out.println(q);
        System.out.println(r);
    }
}