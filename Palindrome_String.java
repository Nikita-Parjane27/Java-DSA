import java.util.Scanner;

public class Palindrome_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter String: ");
        String str= sc.nextLine();

        String reversedStr="";

        for(int i=0; i<str.length(); i++)
        {
           reversedStr = str.charAt(i) + reversedStr;
        }

        if (str.equalsIgnoreCase(reversedStr)) {
            System.out.println(str + " is a palindrome string");
        }
        else
        {
            System.out.println(str + " is not a palindrome string");
        }
        sc.close();
    }
}
