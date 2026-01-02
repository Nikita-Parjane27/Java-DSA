import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks=sc.nextInt();

        if((marks<=100) && (marks>=90)){
            System.out.println("Result: Grade A");
        }
        else if ((marks<=90) && (marks>=80)) {
             System.out.println("Result: Grade B");
        }
        else if ((marks>=60)&& (marks<=70)) {
             System.out.println("Result: Grade C");
        }
        else{
             System.out.println("You areFail");
        }
        sc.close();
    }
}

