package reise;

import java.util.HashSet;
import java.util.Iterator;

public class TravelIterator implements Iterator<Destination> {

    private Destination currentDestination;
    private HashSet<Destination> visited;

    public TravelIterator(Destination startDestination) {
        currentDestination = startDestination;
        visited = new HashSet<>();
    }


    public Destination getCurrentDestination() {
        return currentDestination;
    }

    public void setCurrentDestination(Destination currentDestination) {
        this.currentDestination = currentDestination;
    }

    public HashSet<Destination> getVisited() {
        return visited;
    }

    public void setVisited(HashSet<Destination> visited) {
        this.visited = visited;
    }

    @Override
    public boolean hasNext() {
        return currentDestination != null;
    }

    @Override
    public Destination next() {
        Destination newD = currentDestination;
        visited.add(currentDestination);
        boolean found = false;
        if (hasNext()) {
            for (Destination dest : currentDestination.getTrainConnections()) {
                if (!visited.contains(dest)) {
                    currentDestination = dest;
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            currentDestination = null;
        }
        return newD;
    }
}
