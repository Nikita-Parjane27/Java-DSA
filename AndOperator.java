import java.util.Scanner;

public class AndOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: " );
        int marks=sc.nextInt();
        System.out.println();
        System.out.print("Enter income: ");
        double income=sc.nextDouble();

        if((marks > 80) && (income < 200000))
        {
            System.out.println("You get the scholorship");
        }
        else{
            System.out.println("Sorry you are not eligible");
        }
        sc.close();
    }
}
