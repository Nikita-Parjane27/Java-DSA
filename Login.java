import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /* 
        String username = "Avyaan_27";
        String password = "avyaan123@";
        */
        System.out.print("Enter username: ");
        String uname = sc.nextLine();

        System.out.print("Enter password: ");
        String pass = sc.nextLine();
        /* 
        if((username.equalsIgnoreCase(uname) && (password.equals(pass))))
        {
            System.out.println("Login Successfull....");
        }
        else
        {
            System.out.println("Sorry! Invalid Credentials...");
        }
        */
        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        String domain = "gmail.com";
        if(email.contains(domain))
        {
            System.out.println("Your domail is Gmail.com");
        }
        else{
            System.out.println("Your domain is different");
        }
        if(pass.length()>=8)
        {
            System.out.println("Password is strong");
        }
        else{
            System.out.println("Password is weak");
        }
        sc.close();
    }
}
