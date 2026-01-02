import java.util.Scanner;

public class Address {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter name: ");
        String name =sc.nextLine();

        System.out.println("Enter city: ");
        String city=sc.next();

        System.out.println("Hii... "+ name + " Welcome to "+ city);

        sc.close();
    }
}
