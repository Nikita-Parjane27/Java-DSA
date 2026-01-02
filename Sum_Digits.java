import java.util.Scanner;

public class Sum_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int number = sc.nextInt();
        int tempNumber = number; // Use a temporary variable to not lose the original
        int sum = 0;

        // Get the last digit
        sum += tempNumber % 10;
        // Remove the last digit
        tempNumber /= 10;

        // Get the new last digit (original middle digit)
        sum += tempNumber % 10;
        // Remove it
        tempNumber /= 10;

        // Get the final digit (original first digit)
        sum += tempNumber;

        System.out.println("The sum of the digits in " + number + " is " + sum);

        sc.close();
    }
}
