import java.util.Scanner;

public class NumberFactor {
    public static void factor(int number)
    {
        System.out.println("The factor : " );
        for(int i=1; i<=number; i++)
        {
            if (number%i==0) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter number : ");
        int number=sc.nextInt();

        factor(number);
        sc.close();
    }
}
