import java.util.Scanner;

public class Print_Array {
    
    public static void printarray(int arr[])
    {
        System.out.println("Printing Array elements : ");
         for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int arr[]= new int[5];
        System.out.println("Enter array elements: ");

        for(int i=0; i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }

        printarray(arr);
    
        sc.close();
    }
}
