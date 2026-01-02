import java.util.Scanner;

public class Area_Rectangle {

    public int calculateArea(int length,int width){
        int area =length*width;
        return area;
    }
    public static void main(String[] args) {

        Area_Rectangle ar=new Area_Rectangle();
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter length: ");
        int length=sc.nextInt();
        System.out.print("Enter width: ");
        int width=sc.nextInt();

        System.out.println("Area of Rectangle is: " +  ar.calculateArea(length, width));

        sc.close();
    }
}
