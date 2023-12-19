package org.example;

import java.util.Iterator;

public class MyList<T> implements Iterable<T> {
    Node<T> head, tail;

    public MyList() {
        this.head = null;
        this.tail = null;
    }

    public MyList(Node<T> head, Node<T> tail) {
        this.head = head;
        this.tail = tail;
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
        return new MyIterator<T>(head);
    }

    public void add(T newNode) {
        if (head == null) {
            head = new Node<>(newNode);
            tail = head;
        } else {
            var newTail = new Node<>(newNode);
            tail.setNext(newTail);
            tail = newTail;
        }
    }
}
