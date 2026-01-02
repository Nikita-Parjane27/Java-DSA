import java.util.Scanner;

public class DailySaving {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Raju's daily earning (in INR): ");
        int dailyEarning = sc.nextInt();

        // Calculate savings for 6 days (Mon-Sat)
        int savingsSixDays = dailyEarning * 6;

        // On Sunday, he spends double, so savings are 0.
        int savingsSunday = 0;

        // Total weekly savings
        int weeklySavings = savingsSixDays + savingsSunday;

        System.out.println("Raju's total weekly savings: " + weeklySavings);

        sc.close();

    }
}
