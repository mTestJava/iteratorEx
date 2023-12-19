package org.example;

import org.example.Node;

class MyIterator<T> implements java.util.Iterator<T> {

    Node<T> current;

    public MyIterator(Node<T> current) {
        this.current = current;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public T next() {
        T data = current.data;
        current = current.next;
        return data;
    }
}