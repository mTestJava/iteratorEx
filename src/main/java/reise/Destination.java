package reise;

import java.util.ArrayList;
import java.util.List;


public class Destination {
    private String name;
    private List<Destination> trainConnections;

    public Destination(String name) {
        this.name = name;
        this.trainConnections = new ArrayList<>();
    }

    public String getName() {
        return name;
    }


    public void addTrainConnection(Destination other) {
        trainConnections.add(other);
    }

    public List<Destination> getTrainConnections() {
        return trainConnections;
    }

}
