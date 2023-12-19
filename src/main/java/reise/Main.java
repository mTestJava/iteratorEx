package reise;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        Destination start = new Destination("South pole");
        Destination d1 = new Destination("Iceberg");
        Destination d2 = new Destination("Madagascar");
        Destination d3 = new Destination("Atlantis");

        // start-d1,d2
        // d1- d3,d2
        // d3- d2
        start.addTrainConnection(d1);
        start.addTrainConnection(d2);

        d1.addTrainConnection(d3);
        d1.addTrainConnection(d2);

        d3.addTrainConnection(d2);

        Travel graph = new Travel(start);

        for (Destination st : graph) {
            System.out.println(st.getName());
        }


//        TravelIterator iter = new TravelIterator(start);
//        while(iter.hasNext()){
//            System.out.println(iter.getCurrentDestination().getName());
//            iter.next();
//        }

//        TravelIterator iter = new TravelIterator(graph.getStartDestination());
//        while(iter.hasNext()){
//            System.out.println(iter.getCurrentDestination().getName());
//            iter.next();
//        }
    }
}
