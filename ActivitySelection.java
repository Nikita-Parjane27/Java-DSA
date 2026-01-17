import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {

    // Activity class to keep start and finish together
    static class Activity {
        int start, finish;

        Activity(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }

    public static int maxActivities(int[] start, int[] finish) {
        int n = start.length;

        // Create activity objects
        Activity[] activities = new Activity[n];
        for (int i = 0; i < n; i++) {
            activities[i] = new Activity(start[i], finish[i]);
        }

        // Sort activities by finish time
        Arrays.sort(activities, Comparator.comparingInt(a -> a.finish));

        int count = 1;
        int lastFinishTime = activities[0].finish;

        // Select remaining activities
        for (int i = 1; i < n; i++) {
            if (activities[i].start >= lastFinishTime) {
                count++;
                lastFinishTime = activities[i].finish;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] finish = {2, 4, 6, 7, 9, 9};

        System.out.println(
            "Maximum number of activities that can be selected: " +
            maxActivities(start, finish)
        );
    }
}
