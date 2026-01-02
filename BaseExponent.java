import java.util.Scanner;

public class BaseExponent {
      public static void calExponent(int base, int exponent){
        int result = 1;
        for( int i = 0; i < exponent; i++){
            result *= base;
        }
        System.out.println(result);
    } 
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input base and exponent
        System.out.print("Enter base: ");
        int base = sc.nextInt();

        System.out.print("Enter exponent: ");
        int exponent = sc.nextInt();
        calExponent(base, exponent);
    }
}
