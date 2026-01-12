import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class TopKelement {

    //Top K Largest Elements

   /* public static void main(String[] args) {

        int[] arr = {5, 12, 3, 17, 9, 21, 8};
        int k = 3;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : arr) {
            pq.add(num);

            if (pq.size() < k) {
                pq.poll(); // remove smallest element
            }
        }

        System.out.println("Top " + k + " smallest elements:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }

    public static int[] topKElements(int[] arr, int k) {
        if (k<=0) {
            return new int[0];
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int id=0; id<arr.length; id++) {
            int x=arr[id];
            if (pq.size()<k) {
                pq.offer(x);
            }
            else if(!pq.isEmpty() && x<pq.peek()) {
                pq.poll();
                pq.offer(x);
            }
        }
        Integer[] result = pq.toArray(new Integer[0]);
        int[] res = new int[result.length];
        for(int id=0; id<result.length; id++) {
            res[id]=result[id];
        }
        Arrays.sort(res);
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {5, 12, 3, 17, 9, 21, 8};
        int k = 3;
        int[] topK = topKElements(arr, k);
        System.out.println("Top " + k + " smallest elements: " + Arrays.toString(topK));
    }*/

    //Top K Smallest Elements
    /* public static int[] topKElements(int[] arr, int k) {
        if (k<=0) {
            return new int[0];
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int id=0; id<arr.length; id++) {
            int x=arr[id];
            if (pq.size()<k) {
                pq.offer(x);
            }
            else if(!pq.isEmpty() && x<pq.peek()) {
                pq.poll();
                pq.offer(x);
            }
        }
        Integer[] result = pq.toArray(new Integer[0]);
        int[] res = new int[result.length];
        for(int id=0; id<result.length; id++) {
            res[id]=result[id];
        }
        Arrays.sort(res);
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {5, 12, 3, 17, 9, 21, 8};
        int k = 3;
        int[] topK = topKElements(arr, k);
        System.out.println("Top " + k + " smallest elements: " + Arrays.toString(topK));
    }*/
}