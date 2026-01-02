public class FloorNumber {
    // Find the floor of an element in a sorted array.
    public static void findNumber(int []arr, int target){
        int low = 0;
        int high = arr.length - 1;
        int floor = -1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                // Found the target
                System.out.println("Floor of " + target + " is: " + arr[mid]);
                return;
            } else if (arr[mid] < target) {
               floor = arr[mid]; // Update floor
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        //System.out.println("Floor of " + target + " is: " + floor);
        if (floor != -1) {
            //System.out.println("Floor of " + target + " is: " + floor);
            System.out.println("Floor of " + target + " is: " + arr[floor] + " at index " + floor);
        } else {
            System.out.println("No floor found for " + target);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8, 10};
        int target = 5;
        findNumber(arr, target);
    }
}
