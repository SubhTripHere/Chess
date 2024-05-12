

public class Knight extends Piece{

    Knight(Color color){
        super(color);
    }
    @Override
    public boolean validMove(Move move, Cell[][] board) {
        return false;
    }
}
