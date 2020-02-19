package company.mohamedali.Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("a");
        queue.add("b");
        queue.add("c");

        // moves to rear of queue
        queue.offer("d");

        // returns null if queue is empty
        var front = queue.peek();
        System.out.println(front);

        // rmoves the first element in queue
        var frontofq = queue.remove();
        System.out.println(queue);


    }
}
