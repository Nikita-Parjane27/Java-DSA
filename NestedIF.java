public class NestedIF {
    public static void main(String[] args) {
       // Try to make this code cleaner

        String loanType = "Personal"; // Or "Home"
        int creditScore = 720;
        int annualIncome = 600000; // For Personal Loan
        int propertyValue = 2500000; // For Home Loan

        System.out.println("Checking eligibility for a " + loanType + " Loan...");

        if (loanType.equals("Personal")) 
        {
            if (creditScore >= 700 && annualIncome >= 500000) 
            {
                System.out.println("Eligible for Personal Loan. Congratulations!");
            } 
            else 
            {
                System.out.println("Not eligible for Personal Loan. Criteria not met.");
            }
        } 
        else if (loanType.equals("Home")) 
        { // Using else if for clarity
            if (creditScore >= 650 && propertyValue >= 2000000) 
            {
                System.out.println("Eligible for Home Loan. Congratulations!");
            } 
            else 
            {
                System.out.println("Not eligible for Home Loan. Criteria not met.");
            }
        } 
        else 
        {
            System.out.println("Invalid loan type specified.");
        }
    }
}