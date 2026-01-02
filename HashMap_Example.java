import java.util.*;
public class HashMap_Example {
    /*public static void main(String[] args) {
        // Create a HashMap to store state-capital pairs
        HashMap<String, String> stateCapitals = new HashMap<>();
        stateCapitals.put("Maharashtra", "Mumbai");
        stateCapitals.put("Karnataka", "Bengaluru");
        stateCapitals.put("Gujarat", "Gandhinagar");
        stateCapitals.put("Rajasthan", "Jaipur");
        stateCapitals.put("Tamil Nadu", "Chennai");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the state name: ");
        String state = sc.nextLine();

        if (stateCapitals.containsKey(state)) {
            System.out.println("The capital of " + state + " is " + stateCapitals.get(state));
        } else {
            System.out.println("State not found in the list!");
        }
        sc.close();
    }*/
    
    //counting the number of words in a string and frequency of each word using hashmap
    public static void main(String[] args) {
        String str = "hello world";
        str = str.toLowerCase(); 
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (ch != ' ') { 
                if (freqMap.containsKey(ch)) {
                    freqMap.put(ch, freqMap.get(ch) + 1);
                } else {
                    freqMap.put(ch, 1);
                }
            }
        }
        System.out.println("Character frequencies: " + freqMap);
    }
}
