public class StringBuilder_problem {
    
    public static void checkpalindrome(StringBuilder str) {
        // 1. Clean the string of any non alpha numeric, convert to lower case
        StringBuilder cleaned = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                cleaned.append(Character.toLowerCase(ch));
            }
        }

        // 2. Reverse the cleaned string
        StringBuilder reversed = new StringBuilder(cleaned).reverse();

        // 3. Compare Original with reversed string
        if (cleaned.toString().equals(reversed.toString())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
    
    public static void main(String[] args) {
        
         // Step 1: Initialize StringBuilder with "Report for "
         StringBuilder report = new StringBuilder("Report for ");
          
          // Step 2: Append a specific date
          report.append("2025-07-18");
          
          // Step 3: Append newline and heading
          report.append("\n--- Daily Summary ---");
          
          // Step 4: Append two bullet points
          report.append("\n Sales: 500 units");
          report.append("\n Revenue: ₹50,000");
         
         // Step 5: Insert user's name before "Daily Summary"
         // Find index of "Daily Summary" and insert "Priya's " before it
          int index = report.indexOf("Daily Summary");
         report.insert(index, "Priya's ");
         
         // Step 6: Print the final report
         System.out.println(report.toString());
        

        StringBuilder str = new StringBuilder("Mad1a2m");

       checkpalindrome(str);
    }
}
