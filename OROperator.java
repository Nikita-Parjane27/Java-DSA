import java.util.Scanner;

public class OROperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: " );
        String bank_name=sc.nextLine();
        System.out.println();
        System.out.print("Enter amount: ");
        int amount=sc.nextInt();

        if((bank_name=="Bank A") || (amount>5000))
        {
            System.out.println("You get the discount");
        }
        else{
            System.out.println("Sorry you are not eligible for discount");
        }
        sc.close();
    }
}
