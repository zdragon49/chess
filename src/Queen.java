public class Queen extends Parent {
    public Queen(int row, int col, String color) {
        super(row, col, color);
    }
    public boolean mayMove(int row, int col) {
        for (Chess piece : pieces) {
            if (piece.findRow() == row && piece.findColumn() == col) return false;
        } if (row > 7 || row < 0) return false;
        if (col > 7 || col < 0) return false;
        if (Math.abs(row - this.findRow()) == Math.abs(col - this.findColumn()) && row != this.findRow() && col != this.findColumn()) return true;
        if (row == this.findRow() && col != this.findColumn()) return true;
        return (row != this.findRow() && col == this.findColumn());
    }

    public boolean canDefeat(Chess piece) {
        if (Math.abs(piece.findRow() - this.findRow()) == Math.abs(piece.findColumn() - this.findColumn()) && piece.findRow() != this.findRow() && piece.findColumn() != this.findColumn() && !piece.findColor().equals(this.findColor())) return true;
        if (this.findColumn() == piece.findColumn() && this.findRow() != piece.findRow() && !piece.findColor().equals(this.findColor())) return true;
        return (this.findColumn() != piece.findColumn() && this.findRow() == piece.findRow() && !piece.findColor().equals(this.findColor()));
    }
}