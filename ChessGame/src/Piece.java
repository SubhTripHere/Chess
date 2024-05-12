
public abstract class Piece {
    Color color;
    public Piece(Color color) {
        this.color = color;
    }
    public abstract boolean validMove(Move move, Cell[][] board);
}
