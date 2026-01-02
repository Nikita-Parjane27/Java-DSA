import java.util.Scanner;

public class Present_Array {
    public static void FindElement(int[] arr, int target){
        int index = -1;
        for(int i = 0; i < arr.length; i++){
            if(target==arr[i]){
                index = i;
            }
        }
        if (index != -1)
         System.out.println((target + " Found the number at index " + index));
      else
         System.out.println(("[FindNumber] Number not found "));
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int arr[]= new int[5];
        System.out.println("Enter array elements: ");

        for(int i=0; i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter target: ");
        int target=sc.nextInt();

        FindElement(arr,target);
    
        sc.close();
    }
}
