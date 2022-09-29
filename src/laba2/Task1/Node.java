package laba2.Task1;

public class Node {
    private int countNumber;
    private Node next;

    public Node(int countNumber, Node next) {
        this.countNumber = countNumber;
        this.next = next;
    }

    public int getCountNumber() {
        return countNumber;
    }

    public void setCountNumber(int countNumber) {
        this.countNumber = countNumber;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
