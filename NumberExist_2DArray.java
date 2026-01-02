import java.util.Scanner;

public class NumberExist_2DArray {
    //Search for the target
    public static void NumberExist(int[][] arr, int target)
    {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) { // rows
            for (int j = 0; j < arr[i].length; j++) { // columns
                if (arr[i][j] == target) {
                    System.out.println("Number found at: Row = " + i + ", Column = " + j);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Number not found in the array.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int[][] arr = {{10, 20, 30},{40, 50, 60},{70, 80, 90}};

        System.out.print("Enter the number to search: ");
        int target = sc.nextInt();

        NumberExist(arr, target);
        sc.close();
    }
}
