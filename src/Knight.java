public class Knight extends Parent {
    public Knight(int row, int col, String color) {
        super(row, col, color);
    }
    public boolean mayMove(int row, int col) {
        for (Chess piece : pieces) {
            if (piece.findRow() == row && piece.findColumn() == col) return false;
        }
        if (row > 7 || row < 0) return false;
        if (col > 7 || col < 0) return false;
        if (Math.abs(row - this.findRow()) == 2 && Math.abs(col - this.findColumn()) == 1) return true;
        return (Math.abs(row - this.findRow()) == 1 && Math.abs(col - this.findColumn()) == 2);
    }

    public boolean canDefeat(Chess piece) {
        if (Math.abs(piece.findRow() - this.findRow()) == 2 && Math.abs(piece.findColumn() - this.findColumn()) == 1 && !piece.findColor().equals(this.findColor())) return true;
        return (Math.abs(piece.findRow() - this.findRow()) == 1 && Math.abs(piece.findColumn() - this.findColumn()) == 2 && !piece.findColor().equals(this.findColor()));
    }
}