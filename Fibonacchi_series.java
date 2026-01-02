public class Fibonacchi_series {
    public static void Calculate_Fibonacci(int n)
    {
        int num1=0;
        int num2=1;
        int result;

        System.out.println("Fibonacci series is : ");
        for(int i=0; i<n; i++)
        {
            System.out.print(num1 + "  ");
            result=num1+num2;
            num1=num2;
            num2=result;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n=9;
        Calculate_Fibonacci(n);
    }
}
