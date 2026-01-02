import java.util.Scanner;

public class Print2D_Array {
    // Printing 2D Array Elements  
    public static void print2d(int[][] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Sum of 2D Array Elements 
    public static void Sum2d(int[][] arr)
    {
        int sum=0;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                sum+=arr[i][j];
            }
        }
        System.out.println("The sum 2d array is : " + sum);
    }

    // Sum of Specifc Row 
    public static void SumRow(int[][] arr, int rowNum)
    {
        int rsum=0;
        for (int j = 0; j < arr[rowNum].length; j++) {
            rsum += arr[rowNum][j];
        }

        System.out.println("Sum of row " + rowNum + " is: " + rsum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[][] arr= { {1,2,3},{4,5,6},{7,8,9},{10,11,12}};

        print2d(arr);
        Sum2d(arr);

        System.out.println("Enter Row number : ");
        int rowNum=sc.nextInt();

        SumRow(arr,rowNum);

        sc.close();
    }
}
