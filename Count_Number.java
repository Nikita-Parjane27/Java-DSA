import java.util.Scanner;

public class Count_Number {
    public static void CountOccurence(int target, int[] arr) {
        int occurenceCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) { // found it
                occurenceCount++;
            }
        }
        System.out.println(("the number occured " + occurenceCount + " number of times "));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target element: ");
        int target=sc.nextInt();

        CountOccurence(target, arr);
        sc.close();
    }

}
