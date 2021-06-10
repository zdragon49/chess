public interface Chess {
    int findRow();
    int findColumn();
    String findColor();
    boolean mayMove(int row, int col);
    boolean canDefeat(Chess piece);
}