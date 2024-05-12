public class Board {
    private static Cell[][] board;
    int rows;
    int cols;
    public static Cell[][] getBoardInstance(int rows, int cols) {
        if(board == null) {
            synchronized (Board.class) {
                if (board == null) {
                    board = initializeBoard(rows,cols);
                    return board;
                }else
                    return board;
            }
        }
        else
            return board;

    }
    private static Cell[][] initializeBoard(int rows, int cols) {
        board = new Cell[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j]=new Cell(new Knight(new Color(true)),i,j);
            }
        }
        return board;
    }

}
