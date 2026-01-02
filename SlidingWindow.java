public class SlidingWindow {

    /*// maximum sum subarray of size k

    public static void maxsumsubarray(int arr[], int k) {
        if(arr.length < k) {
            System.out.println("Invalid");
            return;
        }
        int sum = 0;
        for(int i=0; i<k; i++) {
            sum+=arr[i];
        }
        int maxsum=sum;
        for(int i=k; i<arr.length; i++) {

            sum+=arr[i]-arr[i-k];
            maxsum=Math.max(maxsum, sum);
        }
        System.out.println("The maximum sum of subarray of size " + k + " is: " +
                maxsum);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 15, 5};
        int k = 3;
        maxsumsubarray(arr, k);
    }  */

    // printing subarrays of size k using two pointers
     public static void printsubarrays(int arr[], int k) {
        if (arr.length < k) {
            System.out.println("Invalid");
            return;
        }
        for (int i = 0; i <= arr.length - k; i++) {
            for (int j = i; j < i + k; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int k = 3;
        printsubarrays(arr, k);
    }
}
