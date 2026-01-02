import java.util.Scanner;

public class Count_Temprature {
    public static void CountTemp(int[] temp)
    {
        int count=0;
        for(int i=0; i<temp.length; i++)
        {
            if (temp[i]>29) {
                count++;
            }
        }
        System.out.println("The Temprature is "+ count + " times above 29 ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] temp = new int[5];
        System.out.println("Enter Temprature : ");
        for (int i = 0; i < temp.length; i++) {
            temp[i] = sc.nextInt();
        }

        CountTemp(temp);
        sc.close();
    }
}
