import java.util.ArrayList;

public class MyArrayList {

    //Queue of Bank customers 
    public static void BankQueue()
    {
        ArrayList<String> customerName = new ArrayList<>();
        
        //Adding Customers 
        customerName.add("Sharanya");
        customerName.add("Sanvi");
        customerName.add("Vaibhavi");
        customerName.add("Nivya");

        //Printing First Customer
        System.out.println("First Customer is : " + customerName.getFirst());

        //Removing First Customer
        System.out.println("Removing First customer : " + customerName.removeFirst());

        //printing Number of Customers 
        System.out.println("Number of Customers: " + customerName.size());

        //printing last customer
        System.out.println("Last customer is : " + customerName.getLast());
    }
    public static void main(String[] args) {
        BankQueue();
    }
}
