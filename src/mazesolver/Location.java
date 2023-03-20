package mazesolver;

public class Location {
    private Location prevCell;
    private Coordinate coords;
    private char type;
    private int dist;
    private boolean scanned;

    public Location(int x, int y, char t) {
        coords = new Coordinate(x, y);
        type = t;
        prevCell = null;
        scanned = false;
    }

    public void printCoords() {
        if (prevCell != null) {
            prevCell.printCoords();
        }

        coords.print();

        if (type == 'T') {
            System.out.println("Total distance = " + dist);
        }
    }

    public char getType() { return type; }
    public Location getPrevLocation() { return prevCell; }
    public int getDist() { return dist; }
    public Coordinate getCoord() { return coords; }

    public boolean isScanned() { return scanned; }

    public void setPrevCell(Location prev) { prevCell = prev; }
    public void setDist(int newDist) { dist = newDist; }    
    public void setScanned(boolean newVal) { scanned = newVal; }
}
