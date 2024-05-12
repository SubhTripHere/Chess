
public class Pawn extends Piece {
    Pawn(Color color){
        super(color);
    }
    @Override
    public boolean validMove(Move move, Cell[][] board) {
        return false;
    }
}
