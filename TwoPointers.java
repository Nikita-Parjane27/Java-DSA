import java.util.Arrays;

public class TwoPointers {
    /*
     * //3sum program
     * public static void threeSum(int[] arr, int n) {
     * java.util.Arrays.sort(arr);
     * for (int i = 0; i < n - 2; i++) {
     * // Skip duplicate elements
     * if (i > 0 && arr[i] == arr[i - 1]) continue;
     * 
     * int left = i + 1;
     * int right = n - 1;
     * while (left < right) {
     * int sum = arr[i] + arr[left] + arr[right];
     * if (sum == 0) {
     * System.out.println("Triplet: " + arr[i] + ", " + arr[left] + ", " +
     * arr[right]);
     * // Skip duplicate elements
     * while (left < right && arr[left] == arr[left + 1]) left++;
     * while (left < right && arr[right] == arr[right - 1]) right--;
     * left++;
     * right--;
     * } else if (sum < 0) {
     * left++;
     * } else {
     * right--;
     * }
     * }
     * }
     * }
     * public static void main(String[] args) {
     * int[] arr = {-1, 0, 1, 2, -1, -4};
     * int n = arr.length;
     * threeSum(arr, n);
     * }
     */

    /*
     * //boat saving program
     * public static void RescueBoats(int[] people, int limit) {
     * Arrays.sort(people);
     * int left = 0, right = people.length - 1;
     * int boats = 0;
     * 
     * while (left <= right) {
     * if (people[left] + people[right] <= limit) {
     * left++;
     * }
     * right--;
     * boats++;
     * }
     * System.out.println("Minimum number of boats required: " + boats);
     * }
     * public static void main(String[] args) {
     * int[] people = {3, 4, 2, 1, 5};
     * int limit = 5;
     * RescueBoats(people, limit);
     * }
     */
     /* 
    // removing duplicates
    public static void removeduplicates(int arr[]) {
        int k = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[k-1]) {
                arr[k] = arr[i];
                k++;
            }
        }
        System.out.println("The length of array is : " + k);
        System.out.println("the array is : ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[]= {0,1,1,2,3,3,4,5};
        removeduplicates(arr);
    } */

    //remove elment 
    public static void removeElement(int arr[], int val){
        int k = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != val ){
                arr[k] = arr[i];
                k++;
            }
        }
        System.out.println("The length of array is : " + k);
        System.out.println("the array is : " + Arrays.toString(arr));

    }
    public static void main(String[] args) {
        int arr[] = {3,2,1,1,4,5};
        int val = 3;
        removeElement(arr, val);
    } 
}
