import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str= sc.nextLine();

        int vowel=0;

        String new_String= str.toLowerCase();

        for(int i=0; i<new_String.length(); i++)
        {
            char ch=new_String.charAt(i);

            if (ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
                vowel++; // increment vowel count 
            }
        }
        System.out.println("Total vowels are : " + vowel);
        sc.close();
    }
}
