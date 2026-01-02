public class EvenNumber {
    public static void main(String[] args) {
        for(int i=2; i<=10; i+=2)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }

        int j=2;
        while ( j<=10) {
            if (j%2==0) {
                System.out.println(j);
            }
            j++;
        }
    }
}
