import java.util.Scanner;

public class Encrypt_Decrpt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Characters (A,B,C,....) : ");
        char grade=sc.next().charAt(0);

        char encryptgrade=(char) (grade+8);
        System.out.println("The encrypted grade is: "+ encryptgrade);

        char decryptgrade=(char) (encryptgrade-8);
        System.out.println("The decrypted grade is: "+ decryptgrade);

        sc.close();
    }
}
