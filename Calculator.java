import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Enter operation 1:+ 2:- 3:* 4:/ 5:% ");
        int op = sc.nextInt();

        if (op == 1) {
            System.out.println(a + b);
        } else if (op == 2) {
            System.out.println(a - b);
        } else if (op == 3) {
            System.out.println(a * b);
        } else if (op == 4) {
            System.out.println(a / b);
        } else if (op == 5) {
            System.out.println(a % b);
        } else {
            System.out.println("Invalid Operation");
        }
    }
}