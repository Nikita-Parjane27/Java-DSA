import java.util.Scanner;

public class TicketPriceCounter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double StandarPrice=500.00;

        System.out.println("Enter age: ");
        int age=sc.nextInt();

        double price = 500.00;

        if (age <= 12) {
            price = price * 0.5;
        } else if (age >= 60) {
            price = price * 0.8;
        }

        System.out.printf("Price: %.2f", price);
        sc.close();
    }
}
