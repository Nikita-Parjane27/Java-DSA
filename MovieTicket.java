import java.util.Scanner;

public class MovieTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: " );
        int age=sc.nextInt();
        System.out.print("You are student(true/false): " );
        boolean isStudent= sc.nextBoolean();
        if((age>60)||(isStudent==true))
        {
            System.out.println("Yayy! You get the discount");
        }
        else{
            System.out.println("Sorry you are not eligible for discount");
        }
        sc.close();
    }
}
