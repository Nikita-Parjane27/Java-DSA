public class key_infinite {
    //Search a key in a sorted infinite array.
    public static void searchkey(int[] arr, int key)
    {
        int low = 0;
        int high = 1;

        // Find the range for the binary search
        while ( arr[high] < key) {
            low = high;
            high *= 2;
             if (high >= arr.length) {
                high = arr.length - 1; // avoid out-of-bounds
            }
        }

        // Perform binary search in the identified range
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                System.out.println("Key " + key + " found at index: " + mid);
                return;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Key " + key + " not found.");
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // Example infinite array
        int key = 50;
        searchkey(arr, key);
    }
}
