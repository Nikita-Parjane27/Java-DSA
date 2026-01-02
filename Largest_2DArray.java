import java.util.Scanner;

public class Largest_2DArray {

    //Largets Element in 2D Array 
    public static void largestElement(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("The largest element in array is: " + max);
    }

    //Smallest Element in 2D Array 
    public static void smallestElement(int[][] arr) {
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println("The smallest element in array is: " + min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = {{10,20,30},{40,90,150},{1000,8,0},{60,70,80}};

        largestElement(arr);
        smallestElement(arr);
        sc.close();
    }
}
