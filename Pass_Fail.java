import java.util.Scanner;

public class Pass_Fail {

    public void checkpassfail(int marks){
        if (marks>=40) {
            System.out.println("Congratulations... You are Pass ");
        }
        else{
            System.out.println("Soryy... you are Fail ");
        }
    }
    public static void main(String[] args) {
        Pass_Fail pf=new Pass_Fail();
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks=sc.nextInt();

        pf.checkpassfail(marks);

        sc.close();
    }
}
