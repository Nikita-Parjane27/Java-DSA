import java.util.Scanner;

public class kilometer_meter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter kilometer: ");
        double kilometer=sc.nextDouble();

        double meter= kilometer*1000;

        System.out.println(kilometer + " kilometer is = " + meter);

        sc.close();
    }
}
