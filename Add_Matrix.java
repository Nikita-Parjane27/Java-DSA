public class Add_Matrix {
    //Sum of Matrix Of Same Dimension
    public static void SumMatrix(int[][] arr, int[][] arr2 )
    {
        int[][] matrix= new int[arr.length][arr[0].length];
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                matrix[i][j]=arr[i][j]+arr2[i][j];
            }
        }
         
        //Printing 
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr= { {1,2,3},{4,5,6}};
        int[][] arr2= {{7,8,9},{10,11,12}};

       SumMatrix(arr, arr2);   
    }
}
