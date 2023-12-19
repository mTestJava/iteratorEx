package iter;

import java.util.Iterator;

public class SeriesIter implements Iterator<Integer> {

    int current;
    int end;

    public SeriesIter(int current, int end) {
        this.current = current;
        this.end = end;
    }

    @Override
    public boolean hasNext() {
        return current < end;
    }

    @Override
    public Integer next() {
        int next = current;
        if (hasNext()) {
            current = current + 2;
        }
        return next;
    }
}
