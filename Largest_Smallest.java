import java.util.Scanner;

public class Largest_Smallest {

    public static void largestElement(int[] arr)
    {
        int max=arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if (max<arr[i]) {
                max=arr[i];
            }
        }
        System.out.println("The largest element in array is: "+ max);
    }

    public static void smallestElement(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The smallest element in array is: " + min);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] arr=new int[5];
        System.out.println("Enter array elements: ");
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }

        largestElement(arr);
        smallestElement(arr);
        sc.close();
    }
}
