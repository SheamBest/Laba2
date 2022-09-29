package laba2.Task1;

import java.util.Iterator;

public class Queue implements Iterable<Integer>{
    private Node head;
    private int queue = 0;

    public int getQueue() {
        return queue;
    }

    public void setQueue(int queue) {
        this.queue = queue;
    }

    public void addQueue(final int countNumber){
        this.head = new Node(countNumber,head);
        queue++;
    }

    public int removeQueue(){
        final int countNumber = head.getCountNumber();
        head = head.getNext();
        queue--;
        return countNumber;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<Integer>{
        Node next = head;

        @Override
        public boolean hasNext(){
            return next != null;
        }

        @Override
        public Integer next() {
            final int countNumber = next.getCountNumber();
            next = next.getNext();
            return countNumber;
        }


    }
}
