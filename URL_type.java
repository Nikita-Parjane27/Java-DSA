import java.util.Scanner;

public class URL_type {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter URL: " );
        String url=sc.nextLine();

        if (url.endsWith(".com") ){
            System.out.println("This is a Commercial Website");
        }
        else if (url.endsWith(".org")) {
            System.out.println("This is a Organizational Website");
        }
        else{
            System.out.println("This is a Indian Website");
        }
        
        sc.close();
    }
}
