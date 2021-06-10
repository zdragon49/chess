public class Pawn extends Parent {
    public Pawn(int row, int col, String color) {
        super(row, col, color);
    }
    public boolean mayMove(int row, int col) {
        for (Chess piece : pieces) {
            if (piece.findRow() == row && piece.findColumn() == col) return false;
        } if (this.findRow() >= 7 || this.findRow() <= 0) return false;
        if (this.findColumn() != col) return false;
        if (this.findColor().equals("White") && this.findRow() == 1 && (row - this.findRow() > 2 || row - this.findRow() < 1)) return false;
        if (this.findColor().equals("Black") && this.findRow() == 1 && (row - this.findRow() < -2 || row - this.findRow() > -1)) return false;
        if (this.findColor().equals("White") && row - this.findRow() != 1) return false;
        if (this.findColor().equals("Black") && row - this.findRow() != -1) return false;
        return true;
    }
    public boolean canDefeat(Chess piece) {
        if (this.findColor().equals("White") && Math.abs(piece.findColumn() - this.findColumn()) == 1 && piece.findRow() - this.findRow() == 1 && piece.findColor().equals("Black")) return true;
        return (this.findColor().equals("Black") && Math.abs(piece.findColumn() - this.findColumn()) == 1 && piece.findRow() - this.findRow() == -1 && piece.findColor().equals("White"));
    }
}