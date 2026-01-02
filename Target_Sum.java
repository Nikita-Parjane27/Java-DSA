//import java.util.Scanner;

public class Target_Sum {
    // Adjacent pairs 
    public static void AdjacentPairWithSum(int[] arr, int target) {
        boolean found = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + arr[i + 1] == target) {
                System.out.println("Adjacent pair found: (" + arr[i] + ", " + arr[i + 1] + ")");
                found = true;
                return; 
            }
        }
        if (!found) {
            System.out.println("No pair found that adds to " + target);
        }
    }
    /* 
    // Any pair sum 
    public static void findPairWithSum(int[] arr, int target) {
    boolean found = false;
    for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] + arr[j] == target) {
                System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
                found = true;
                return; // Exit after finding first pair
            }
        }
    }
    if (!found) {
        System.out.println(" No pair found that adds to " + target);
    }
} */
/* 
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.println("Enter 5 array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        AdjacentPairWithSum(arr, target);
       // findPairWithSum(arr, target);

        sc.close();
    }  
        */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 9;
        AdjacentPairWithSum(arr, target);
    }
}
