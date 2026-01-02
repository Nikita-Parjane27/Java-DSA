import java.util.Scanner;

public class Decimal_Binary {

    public void display(int decvalue){
       if (decvalue == 0) {
            System.out.println("Binary conversion is: 0");
            return;
        }

        String binary = "";  // to store binary representation

        // Convert decimal to binary
        while (decvalue > 0) {
            int remainder = decvalue % 2;
            binary = remainder + binary;  // prepend remainder
            decvalue = decvalue / 2;
        }

        System.out.println("Binary conversion is: " + binary);
    }
    public static void main(String[] args) {
        Decimal_Binary db=new Decimal_Binary();
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter decimal number: ");
        int decvalue=sc.nextInt();

        db.display(decvalue);

        sc.close();
    }
}
