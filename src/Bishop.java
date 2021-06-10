public class Bishop extends Parent {
    public Bishop(int row, int col, String color) {
        super(row, col, color);
    }
    public boolean mayMove(int row, int col) {
        for (Chess piece : pieces) {
            if (piece.findRow() == row && piece.findColumn() == col) return false;
        }if (row > 7 || row < 0) return false;
        if (col > 7 || col < 0) return false;
        return (Math.abs(row - this.findRow()) == Math.abs(col - this.findColumn()) && row != this.findRow() && col != this.findColumn());
    }
    public boolean canDefeat(Chess piece) {
        return (Math.abs(piece.findRow() - this.findRow()) == Math.abs(piece.findColumn() - this.findColumn()) && piece.findRow() != this.findRow() && piece.findColumn() != this.findColumn() && !piece.findColor().equals(this.findColor()));
    }
}