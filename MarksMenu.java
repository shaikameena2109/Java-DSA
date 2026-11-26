import java.util.Scanner;
public class MarksMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        do {
            System.out.println("Enter marks: ");
            int marks = sc.nextInt();
            if (marks >= 90) {
                System.out.println("This is Good");
            } else if (marks >= 60) {
                System.out.println("This is also Good");
            } else if (marks >= 0) {
                System.out.println("This is Good as well");
            } else {
                System.out.println("Invalid Marks");
            }
            System.out.println("Want to continue? (1 for Yes / 0 for No)");
            input = sc.nextInt();
        } while (input == 1);
    }
}