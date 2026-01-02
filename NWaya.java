public class NWaya {
   /* //calculate n ways to reach the nth stair using recursion and memoization
    public static int countWays(int n, int[] arr) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (arr[n] != -1) {
            return arr[n];
        }
        arr[n] = countWays(n - 1, arr) + countWays(n - 2, arr);
        return arr[n];
    }
    public static void main(String[] args) {
        int n = 5; 
        int[] arr = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            arr[i] = -1;
        }
        int ways = countWays(n, arr);
        System.out.println("Number of ways to reach the " + n + "th stair: " + ways);
    }*/

    //calculate n ways to reach the nth stair using dynamic programming using tabulation and memoization
    public static int countWays(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1; 
        dp[1] = 1; 
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 5; 
        int ways = countWays(n);
        System.out.println("Number of ways to reach the " + n + "th stair: " + ways);
    }
}
