package iter;

public class Main {
    public static void main(String[] args) {
        Series s = new Series(1,10);
        SeriesIter si = (SeriesIter) s.iterator();

        while (si.hasNext()) {
            System.out.println(si.current);
            si.next();
        }

//
//        SeriesIter si2 = new SeriesIter(1,10);
//        while (si2.hasNext()) {
//            System.out.println(si2.current);
//            si2.next();
//        }
    }
}
