public class SubString {
    //longest substring without repeating characters using two pointers
    public static int longestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int left = 0, right = 0;
        boolean[] seen = new boolean[256]; // Assuming ASCII character set

        while (right < n) {
            char currentChar = s.charAt(right);
            if (!seen[currentChar]) {
                seen[currentChar] = true;
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                seen[s.charAt(left)] = false;
                left++;
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String input = "abcabcbb";
        int result = longestSubstring(input);
        System.out.println("Longest substring without repeating characters: " + result);
    }
}
