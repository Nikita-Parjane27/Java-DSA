public class Missing_distinctNumber {
    //Find the missing number in a sorted array of distinct numbers from 1 to N.  
    public static void FindMissingNumber(int[] arr) {
        int low = 0;
        int high = arr.length + 1;
      //  int missing = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            // Check if the mid index matches the value
            if (arr[mid] == mid + 1) {
                // Otherwise, it's in the right half
                low = mid + 1;
            } else {
                // If not, the missing number is in the left half
              //  missing = arr[mid] - 1;
                high = mid - 1;
            }
        }

        // The missing number is at the position 'low'
        //System.out.println("Missing number is: " + missing);
        System.out.println("Missing number is: " + (low + 1));
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8}; // Example array with a missing number
        FindMissingNumber(arr);
    }
}
