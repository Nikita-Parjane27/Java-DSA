//import java.util.ArrayList;
public class Arraylist_Recursion {
   /*public  static int sumArray(ArrayList<Integer> list, int index) {
        if (index == list.size()) {
            return 0;
        }
        int current = list.get(index);
        return current + sumArray(list, index + 1);
    } */
   
    /*
    //check if ArrayList<Character> are palindrome using recursion
    public static void checkPalindrome(ArrayList<Character> list, int start, int end) {
        if (start >= end) {
            System.out.println("The ArrayList is a palindrome.");
            return;
        }
        if (!list.get(start).equals(list.get(end))) {
            System.out.println("The ArrayList is not a palindrome.");
            return;
        }
        checkPalindrome(list, start + 1, end - 1);
    }  */

    /* 
    //NUMBER OF OCCURENCESOF TARGET IN ARRAYLIST USING RECURSION
    public static void countOccurrences(ArrayList<Integer> list, int target, int index, int count) {
        if (index == list.size()) {
            System.out.println("Number of occurrences of " + target + ": " + count);
            return;
        }

        // If current element matches target, increment count
        if (list.get(index) == target) {
            count++;
        }

        // Recur for next element
        countOccurrences(list, target, index + 1, count);
    }
    */

    /* 
    //REMOVE OCCURENCE FROM ARRAYLIST USING RECURSION
    public static void removeOccurrences(ArrayList<Integer> list, int target, int index) {
        if (index == list.size()) {
            return;
        }
        if (list.get(index) == target) {
            list.remove(index);
            removeOccurrences(list, target, index);
        } else {
            removeOccurrences(list, target, index + 1);
        }
    }
     public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3);
        list.add(5);
        list.add(3);

        int target = 3;

        // Call the method to remove occurrences
        removeOccurrences(list, target, 0);

        // Print the modified ArrayList
        System.out.println("ArrayList after removing occurrences of " + target + ": " + list);
    }*/

    //factorial using recursion
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

   /* public static void main(String[] args) {
        int n = 5;
        int result = factorial(n);
        System.out.println("Factorial of " + n + ": " + result);
    }*/

    //Array in reverse order
    public static void printReverse(int[] arr, int index) {
        if (index < 0) {
            return;
        }
        System.out.print(arr[index] + " ");
        printReverse(arr, index - 1);
    }

   /* public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("Array in reverse order: ");
        printReverse(arr, arr.length - 1); 
    }*/

    //power using recursion
    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {
        int base = 2;
        int exponent = 3;
        int result = power(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }

   /*  public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(3);

        int target = 3;

        // Call the void recursive method
        countOccurrences(list, target, 0, 0);
    }
    */

    /*public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        list.add('M');
        list.add('a');
        list.add('d');
        list.add('a');
        list.add('N');

        // Call the method (no need to store return value)
        checkPalindrome(list, 0, list.size() - 1);
    }
     */
    /*public static void main(String[] args) {
       /*  ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int sum = sumArray(list, 0);
        System.out.println("Sum of ArrayList elements: " + sum);
    }*/
}

    
