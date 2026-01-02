public class Matrix2D_Search {
    public static void searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int low = 0;
        int high = rows * cols - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;  
            int row = mid / cols;             
            int col = mid % cols;             

            if (matrix[row][col] == target) {
                System.out.println("Element found at: (" + row + ", " + col + ")");
                return;  // target found
            } else if (matrix[row][col] < target) {
                low = mid + 1;  // search right half
            } else {
                high = mid - 1; // search left half
            }
        }
        System.out.println("Element not found in the 2D array.");
    }

    public static void main(String[] args) {
        int[][] arr = {{10, 20, 30},{40, 50, 60},{70, 80, 90}};
        int target = 50;
        searchMatrix(arr, target);
    }
}
