import java.util.Scanner;

public class CGPA_Calculate {

    public void calculateCGPA(double oop, double os, double dsa){
        double cgpa= (oop+os+dsa)/3.0;

        System.out.println("CGPA of 3 subjects is: " + cgpa);
    }
    public static void main(String[] args) {
        CGPA_Calculate cg = new CGPA_Calculate();

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter marks : ");
        double oop=sc.nextDouble();
        double os=sc.nextDouble();
        double dsa=sc.nextDouble();

        cg.calculateCGPA(oop, os, dsa);

        sc.close();
    }
}
