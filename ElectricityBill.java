import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        /*
        System.out.println("Enter unit consumed: ");
        int units= sc.nextInt();

        double bill = 0.0;

        if(units<=50){
            bill = units*3.0;
        }
        else if (units <= 150) {
            bill = (50 * 3.0) + ((units - 50) * 4.5);
        }
        else if (units <= 250) {
            bill = (50 * 3.0) + (100 * 4.5) + ((units - 150) * 6.0);
        }
        else if (units>250){
            bill = (50 * 3.0) + (100 * 4.5) + (100 * 6.0) + ((units - 250) * 8.0);
        }
        else{
            System.out.println("incorrect input");
        }

        System.out.println("the total bill: "+bill);
        */

        System.out.println("enter string: ");
        String s=sc.next();
        System.out.println(s);

        System.out.println("enter string: ");
        String s1=sc.nextLine();
        System.out.println(s1);
      sc.close();
       
    }
}
