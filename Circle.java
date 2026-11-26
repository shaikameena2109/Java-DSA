import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double circumference = 2 * 3.14 * radius;
        double area = 3.14 * radius * radius;

        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);
    }
}