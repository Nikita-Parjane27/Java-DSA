import java.util.Arrays;

public class Reverse_Array {
    public static void ReverseArray(int[] arr)
    {
        //1st Method 
        for(int i=0; i<arr.length; i++){
            // Swap elements
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
           
        }

        // Print reversed array
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr=new int[5];                           
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
         
        ReverseArray(arr);
    }
}
