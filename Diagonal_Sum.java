public class Diagonal_Sum {
    //Sum of Diagonal Element 
    public static void SumDiagonal(int[][] arr)
    {
        int sumdiagonal=0;

        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                if(i==j)
                {
                    sumdiagonal+=arr[i][j];
                }
            }
        }
        System.out.println("The diagonal sum : "+ sumdiagonal);
    }
    public static void main(String[] args) {
        int[][] arr={ {10,20,30},{40,50,60},{70,80,90}};

        SumDiagonal(arr);
    }
}
