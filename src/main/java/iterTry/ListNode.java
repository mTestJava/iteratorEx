package iterTry;

import java.util.Iterator;

public class ListNode<T> implements Iterable<T> {
    Node<T> head;
    Node<T> tail;

    public ListNode() {
        this.head = null;
        this.tail = null;
    }

    void add(T data) {
        if (head == null) {
            head = new Node<T>(data);
            tail = head;
        } else {
            var newTail = new Node<T>(data);
            tail.setNext(newTail);
            tail = newTail;
        }
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public void setTail(Node<T> tail) {
        this.tail = tail;
    }

    @Override
    public Iterator<T> iterator() {
        return new ListNodeIterator<>(head);
    }
}
