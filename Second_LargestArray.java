import java.util.Scanner;

public class Second_LargestArray {
     public static void SeconLargest(int[] arr)
    {
        int max=arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if (max<arr[i]) {
                max=arr[i];
            }
        }
        System.out.println("The largest element in array is: "+ max);

        int secondLargest = arr[0];
        for (int i = 0; i < arr.length; i++) {
        if (arr[i] > secondLargest && arr[i] < max) {
            secondLargest = arr[i];
        }
    }

    if (max == secondLargest) {
        System.out.println("No second largest element (all elements may be equal).");
    } else {
        System.out.println("The second largest element in array is: " + secondLargest);
    }
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

        int[] arr=new int[5];
        System.out.println("Enter array elements: ");
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }

        SeconLargest(arr);
        sc.close();
    }
}
