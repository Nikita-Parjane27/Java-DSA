import java.util.Scanner;

public class StudentPass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Student marks: ");
        int marks=sc.nextInt();
        System.out.print("Enter pass marks: ");
        int pass_marks=sc.nextInt();

        /* if((marks>=40)&&(pass_marks>=40)){
            System.out.println("Result: You are Pass");
        }
        else{
            System.out.println("Result: You are Fail");
        }
        */

        if(marks>=pass_marks){
            System.out.println("Result: You are Pass");
        }
        else{
            System.out.println("Result: You are Fail");
        }
        sc.close();
    }
}
