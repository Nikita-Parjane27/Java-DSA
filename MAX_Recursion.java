import java.util.*;
public class MAX_Recursion{
    public static int findMax(int[] arr,int n,int max)
    {
        if(n<0)
        {
            return max;
        }
        if(arr[n]>max) 

        {
            max = arr[n];
        }
        return findMax(arr,n-1,max);
    }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the elements of the array");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements of the array");
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    int max = Integer.MIN_VALUE;
    System.out.println("The maximum element is "+findMax(arr,n-1,max));
  }
  
}