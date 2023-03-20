package mazesolver;

public class Coordinate {
    private int x;
    private int y;

    public Coordinate(int col, int row) {
        x = col;
        y = row;
    }

    public int getX() { return x; }
    public int getY() { return y; }

    public void print() {
        System.out.println("<" + y + " " + x + ">");
    }
}
