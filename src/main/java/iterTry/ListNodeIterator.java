package iterTry;

import java.util.Iterator;

public class ListNodeIterator<T> implements Iterator<T> {
    Node<T> nextEle;

    public ListNodeIterator(Node<T> current) {
        this.nextEle = current;
    }

    public Node<T> getCurrent() {
        return nextEle;
    }

    public void setCurrent(Node<T> current) {
        this.nextEle = current;
    }

    @Override
    public boolean hasNext() {
        return nextEle != null;
    }

    @Override
    public T next() {
        T cur = nextEle.data;
        nextEle = nextEle.next;
        return cur;
    }
}
