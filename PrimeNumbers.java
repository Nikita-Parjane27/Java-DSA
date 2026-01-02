import java.util.Scanner;

public class PrimeNumbers {
    public static void CheckPrime(int number)
    {
        if(number<=1)
        {
            System.out.println("The number is not prime");
        }
        else{
            for(int i=2; i<number; i++)
            {
                if(number%i==0)
                {
                    System.out.print("Number is not prime");
                    break;
                }
                else{
                    System.out.println(number + " it is prime");
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int number=sc.nextInt();
        CheckPrime(number);
        sc.close();
    }
}
