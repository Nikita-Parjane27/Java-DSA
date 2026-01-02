import java.util.Scanner;

public class Check_Integer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number : ");
    
        if (sc.hasNextInt()) {
            int num=sc.nextInt();
            System.out.println("The number " + num + " is integer");
        }
        else{
            String str=sc.nextLine();
            System.out.println("The number " + str + " is not a integer");
        }
        
        sc.close();
    }
}
