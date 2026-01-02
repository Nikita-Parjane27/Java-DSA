import java.util.Scanner;

public class HolloStar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter side of length: ");
        int side=sc.nextInt();

        for(int i=1; i<=side; i++)
        {
            for(int j=1; j<=side; ++j)
            {
                if (i==1|| i==side || j==1 || j==side) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
