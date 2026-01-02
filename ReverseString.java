import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter String: ");
        String str= sc.nextLine();

        String reversedStr="";

        for(int i=0; i<str.length(); i++)
        {
           reversedStr = str.charAt(i) + reversedStr;
        }
        System.out.println("Reverse string :" + reversedStr);
        sc.close();
    }
}
