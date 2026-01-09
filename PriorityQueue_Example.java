import java.util.PriorityQueue;

public class PriorityQueue_Example {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(3);
        pq.add(2);
        pq.add(7);
        pq.add(1);
        System.out.println("Peek element: " + pq.peek());
        System.out.println("Removed element: " + pq.poll());
        System.out.println("Peek element: " + pq.peek());

    }
}
