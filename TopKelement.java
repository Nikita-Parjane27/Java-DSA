import java.util.PriorityQueue;

public class TopKelement {

    public static void main(String[] args) {

        int[] arr = {5, 12, 3, 17, 9, 21, 8};
        int k = 3;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            minHeap.add(num);

            if (minHeap.size() > k) {
                minHeap.poll(); // remove smallest
            }
        }

        System.out.println("Top " + k + " largest elements:");
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll());
        }
    }
}
