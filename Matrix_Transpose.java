public class Matrix_Transpose {
     // Helper method to print a matrix
    public static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Get dimensions
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Create transpose matrix
        int[][] transpose = new int[cols][rows];

        // Perform transposition
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Print the original matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Print the transposed matrix
        System.out.println("Transposed Matrix:");
        printMatrix(transpose);
    }
}
