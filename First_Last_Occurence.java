public class First_Last_Occurence {
    //find first and last occurrence number
    public static void search_number(int[] arr, int target) {
        int first = -1;
        int last = -1;
        // Find first occurrence
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                first = mid;
                high = mid - 1; 
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        // Find last occurrence
        low = 0;
        high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                last = mid;
                low = mid + 1; 
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (first != -1 && last != -1) {
            System.out.println("First occurrence: " + first);
            System.out.println("Last occurrence: " + last);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 50, 80, 90};
        int target = 50;
        search_number(arr, target);
    }
}
