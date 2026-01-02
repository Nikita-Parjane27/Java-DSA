import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input marks for 3 subjects
        System.out.print("Enter marks for Subject 1 (out of 100): ");
        int sub1 = sc.nextInt();

        System.out.print("Enter marks for Subject 2 (out of 100): ");
        int sub2 = sc.nextInt();

        System.out.print("Enter marks for Subject 3 (out of 100): ");
        int sub3 = sc.nextInt();

        // Calculate total and percentage
        int total = sub1 + sub2 + sub3;
        double percentage = (total / 300.0) * 100;

        // Check conditions
        if (sub1 >= 33 && sub2 >= 33 && sub3 >= 33 && percentage >= 40) {
            System.out.println("Student PASSED!");
            System.out.println("Total: " + total + " | Percentage: " + percentage + "%");
        } else {
            System.out.println(" Student FAILED.");
            System.out.println("Total: " + total + " | Percentage: " + percentage + "%");
        }

        sc.close();
    }
}
