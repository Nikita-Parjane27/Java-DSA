public class Reverse_Recurssion {
    /* 
    //printing number reverse or downward
    public static void printReverse(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return;
        }
       System.out.println(n);
        printReverse(n-1);
    }

    //factorial with recursion
    public static int factorial_Recussion(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n * factorial_Recussion(n-1);
    }
   */

   /*public static void displayArray(int arr[], int index)
   {
       if(index == arr.length)
       {
           return;
       }
       displayArray(arr, index + 1);
       System.out.println(arr[index]);
       
   }
*/
    public static void printMax(int arr[], int index, int max)
    {
        if(index == arr.length)
        {
            System.out.println("Maximum element is : " + max);
            return;
        }
        if(arr[index] > max)
        {
            max = arr[index];
        }
        printMax(arr, index + 1, max);
    }

    public static void main(String[] args) {
        //int n=6;
       // printReverse(n);
        //int fact = factorial_Recussion(n);
        //System.out.println("Factorial is : " + fact);

        int[] arr= {10,20,30,40,50};
        //displayArray(arr, 0);
        printMax(arr, 0, arr[0]);
    }
}

