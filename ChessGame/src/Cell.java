public class Cell {
    private Piece piece;
    int x;
    int y;
    public Cell(Piece piece, int x, int y) {
        this.piece = piece;
        this.x = x;
        this.y = y;
    }
    public Piece getPiece() {
        return piece;
    }
    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

}
