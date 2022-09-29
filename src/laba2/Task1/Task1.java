package laba2.Task1;

public class Task1 {
    public static void main(String[] args) {
        final Queue queue = new Queue();
        queue.addQueue(1);
        queue.addQueue(2);
        queue.addQueue(3);
        queue.addQueue(4);

        System.out.println("Elements in queue: " + queue.getQueue());
        System.out.println("Queue: ");
        for (final int count : queue) {
            System.out.println(count);
        }

        queue.removeQueue();
        System.out.println("Elements in queue: " + queue.getQueue());
        System.out.println("Queue: ");
        for (final int count: queue) {
            System.out.println(count);
        }

        queue.removeQueue();
        System.out.println("Elements in queue: " + queue.getQueue());
        System.out.println("Queue: ");
        for (final int count: queue) {
            System.out.println(count);
        }

        queue.addQueue(56);
        System.out.println("Elements in queue: " + queue.getQueue());
        System.out.println("Queue: ");
        for (final int count: queue) {
            System.out.println(count);
        }
    }
}
