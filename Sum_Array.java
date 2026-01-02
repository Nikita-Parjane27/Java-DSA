import java.util.Scanner;

public class Sum_Array {
    public static void sumArray(int[] arr)
    {
        int sum=0;
        for(int i=0; i<arr.length; i++)
        {
            sum+=arr[i];
        }
        System.out.println("Sum of array elements are : "+ sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] arr=new int[5];
        System.out.println("Enter array elements: ");
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }

        sumArray(arr);
        sc.close();
    }
}
