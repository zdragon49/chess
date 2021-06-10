public class Rook extends Parent {
    public Rook(int row, int col, String color) {
        super(row, col, color);
    }
    public boolean mayMove(int row, int col) {
        for (Chess piece : pieces) {
            if (piece.findRow() == row && piece.findColumn() == col) return false;
        } if (row > 7 || row < 0) return false;
        if (col > 7 || col < 0) return false;
        if (row == this.findRow() && col != this.findColumn()) return true;
        return (row != this.findRow() && col == this.findColumn());
    }
    public boolean canDefeat(Chess piece) {
        if (this.findColumn() == piece.findColumn() && this.findRow() != piece.findRow() && !piece.findColor().equals(this.findColor())) return true;
        return (this.findColumn() != piece.findColumn() && this.findRow() == piece.findRow() && !piece.findColor().equals(this.findColor()));
    }
}