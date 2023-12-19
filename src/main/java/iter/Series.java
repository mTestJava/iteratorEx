package iter;

import java.util.Iterator;

public class Series implements Iterable<Integer> {


    int start;
    int end;

    public Series(int start, int end) {
        this.start = start;
        this.end=end;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new SeriesIter(start,end);
    }
}
