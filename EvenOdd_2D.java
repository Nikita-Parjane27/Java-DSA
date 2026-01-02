public class EvenOdd_2D {
    //Count of Even and Odd Numbers in 2D Array 
    public static void CountEvenOdd(int[][] arr)
    {
        int EvenCount=0;
        int OddCount=0;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                if(arr[i][j]%2==0)
                {
                    EvenCount++;
                }
                else{
                    OddCount++;
                }
            }
        }
        System.out.println("The total Even Numbers are: "+ EvenCount);
        System.out.println("The total Odd Numbers are: "+ OddCount);
    }
    public static void main(String[] args) {
        int[][] arr={{10,2,5},{7,9,8},{90,0,33}};

       CountEvenOdd(arr);
    }
}
