import java.util.Scanner;

public class Ascending_Array {
    public static boolean isArraySort(int[] arr)
    {
        for(int i=0; i<arr.length-1; i++)
        {
                if(arr[i] > arr[i + 1]) {
                    return false;
                }

        }
        return true;

    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        if (isArraySort(arr)) {
            System.out.println("Array is in ascending order ");
        }
        else{
            System.out.println("Array is not sorted in ascending order");
        }

        sc.close();
    }
}
