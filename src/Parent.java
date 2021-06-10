import java.util.ArrayList;
// Parent class for all chess pieces (declared all variables used everywhere here)
public abstract class Parent implements Chess {
    protected int r;
    protected int c;
    protected String color;
    public static ArrayList<Chess> pieces = new ArrayList<>();
    public Parent(int row, int col, String color) {
        r = row;
        c = col;
        this.color = color;
    }public int findRow() {
        return r;
    }public int findColumn() {
        return c;
    }public String findColor() {
        return color;
    }
}