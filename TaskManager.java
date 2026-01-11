import java.util.PriorityQueue;

 class Tasks1{
    String task;
    int priority;

    Tasks1(String tasks, int priority){
        this.task= tasks;
        this.priority= priority;
    }
    public String toString() {
    return task + " (Priority: " + priority + ")";
} 
}
public class TaskManager {
    public static void main(String[] args){
        PriorityQueue<Tasks1> pq = new PriorityQueue<>(
            (t1,t2)-> Integer.compare(t1.priority, t2.priority)
        );

        pq.add(new Tasks1("Study", 90));
        pq.add(new Tasks1("Eat", 75));
        pq.add(new Tasks1("Sleep", 60));
        pq.add(new Tasks1("Exercise", 30));
        pq.add(new Tasks1("Travel", 80));

        System.out.println("Tasks in order of their priority: ");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
