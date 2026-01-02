public class Dyanamin {
    //house robbers problem using dynamic programming memoization
    public static int rob(int[] nums, int n, int[] dp) {
        if (n < 0) {
            return 0;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        int include = nums[n] + rob(nums, n - 2, dp);
        int exclude = rob(nums, n - 1, dp);
        dp[n] = Math.max(include, exclude);
        return dp[n];
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1};
        int n = nums.length;
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = -1;
        }
        int maxAmount = rob(nums, n - 1, dp);
        System.out.println("Maximum amount that can be robbed: " + maxAmount);
    }
}
