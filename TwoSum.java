public class TwoSum {
    /*
     * // Two Sum Problem converging pointers approach
     * public static void findTwoSum(int[] arr, int target) {
     * int left = 0;
     * int right = arr.length - 1;
     * while (left < right) {
     * int sum = arr[left] + arr[right];
     * if (sum == target) {
     * System.out.println("Pair found: [" + left + ", " + right + "]");
     * return;
     * } else if (sum < target) {
     * left++;
     * } else {
     * right--;
     * }
     * }
     * System.out.println("No pair found that adds to " + target);
     * }
     * public static void main(String[] args) {
     * int[] arr = {1, 2, 3, 4, 5};
     * int target = 9;
     * findTwoSum(arr, target);
     * }
     */

   /*  // palindrome check only alphanumeric characters and ignoring cases
    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        if (isPalindrome(s)) {
            System.out.println("\"" + s + "\" is a palindrome.");
        } else {
            System.out.println("\"" + s + "\" is not a palindrome.");
        }
    } */

    //remove duplicates in place using sliding window
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;
        int k = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i-1]) {
                k++;
                arr[k] = arr[i];
            }
        }
        return k + 1; // New length of the array
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 5};
        int newLength = removeDuplicates(arr);
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}