public class Backtrack_1 {
    /* 
    //string 0's and 1's and length of string N
    public static void generateBinaryStrings(int n, String str) {
        if (str.length() == n) {
            System.out.println(str);
            return;
        }
        generateBinaryStrings(n, str + '0');
        generateBinaryStrings(n, str + '1');
    }

    public static void main(String[] args) {
        int n = 3; // Length of the binary strings
        String str = "";
        generateBinaryStrings(n, str);
    }*/

    /* 
    //string permutations
    public static void generatePermutations(String str, String perm, boolean[] used) {
        if (perm.length() == str.length()) {
            System.out.println(perm);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            if (used[i]) continue;
            used[i] = true;
            generatePermutations(str, perm + str.charAt(i), used);
            used[i] = false; // backtrack
        }
    }
    public static void main(String[] args) {
        String str = "ABC";
        boolean[] used = new boolean[str.length()];
        generatePermutations(str, "", used);
    }*/

    /* 
    //string permutation using swap 
    public static void generatePermutations(char[] arr, int left, int right) {
        if (left == right) {
            System.out.println(String.valueOf(arr));
            return;
        }
        for (int i = left; i <= right; i++) {
            swap(arr, left, i);
            generatePermutations(arr, left + 1, right);
            swap(arr, left, i); // backtrack
        }

    }
    private static void swap(char[] arr, int left, int i) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'swap'");
        char temp = arr[i];
    int j = 0;
    arr[i] = arr[j];
    arr[j] = temp;
    }
    public static void main(String[] args) {
        String str = "ABC";
        char[] arr = str.toCharArray();
        generatePermutations(arr, 0, arr.length-1);
    }*/

    /* 
    public static void books_permutation(String str,String result){
        if(str.length() == 0){
            System.out.println(result);
            return;
        }
        for(int i = 0 ;i<str.length();i++){
            char ch = str.charAt(i);
            String remaining_ch = str.substring(0,i)+str.substring(i+1);
            books_permutation(remaining_ch,result+ch);
        }
    }    
    public static void main(String[] args) {
        String str = "ABC";
        books_permutation(str,"");
    }*/

    /* 
    // Function to solve the maze
    public static void solveMaze(int[][] maze, int n) {
        int[][] path = new int[n][n]; // path tracker
        backtrack(maze, 0, 0, path, n);
    }

    // Backtracking function
    private static void backtrack(int[][] maze, int row, int col, int[][] path, int n) {
        // Base case: reached destination
        if (row == n - 1 && col == n - 1) {
            path[row][col] = 1;
            printPath(path, n);
            path[row][col] = 0; // backtrack
            return;
        }

        // Check if (row, col) is valid
        if (row < 0 || col < 0 || row >= n || col >= n || maze[row][col] == 0 || path[row][col] == 1) {
            return;
        }

        // Mark current cell
        path[row][col] = 1;

        // Move Down
        backtrack(maze, row + 1, col, path, n);

        // Move Right
        backtrack(maze, row, col + 1, path, n);

        // Backtrack: unmark
        path[row][col] = 0;
    }

    // Function to print the path
    private static void printPath(int[][] path, int n) {
        System.out.println("Path:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(path[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Main function
    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };
        int n = maze.length;

        solveMaze(maze, n);
    }*/

    //obstacles maze if 1 obstacle and 0 as open cell
    public static void obstacle_maze(int[][] maze, int n, int row, int col, String path) {
        if (row == n-1 && col == n-1) {
            System.out.println(path);
            return;
        }
        if (row >= n || col >= n || maze[row][col] == 1) {
            return;
        }
        obstacle_maze(maze, n, row+1, col, path + 'D');
        obstacle_maze(maze, n, row, col+1, path + 'R');
    }
  
    public static void main(String[] args) {
        int[][] maze = {
            {0, 1, 0},
            {0, 1, 0},
            {0, 0, 0}
        };
        int n = maze.length;
        obstacle_maze(maze, n, 0, 0, "");
    }
}
