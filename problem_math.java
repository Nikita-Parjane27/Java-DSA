import java.util.Scanner;

public class problem_math {
    public static void CalculateArea(double radius)
    {
        double result=3.14*radius*radius;
        System.out.println("Area of circle is : " + result);
    }

     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double radius=3.5;
        CalculateArea(radius);
        System.out.print("Enter number : ");
        double number= sc.nextInt();
        double absolutevalue=Math.abs(number);
        System.out.println("Absolute value : " + absolutevalue);
        int num=25;
        double square=Math.sqrt(num);
        System.out.println(square);
        

        //simulate rolling dice 
        int diceRoll = (int)(Math.random() * 6) + 1;

        System.out.println("You rolled a: " + diceRoll);
    }
}
