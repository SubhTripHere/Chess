import java.util.*;

public class ChessGame {
    public Cell[][] board;
    public Player p1;
    public Player p2;
    Player currTurn;
    List<Move> moveList;
    int rows;
    int cols;
    Player winner ;
    Queue<Player> playerQueue= new LinkedList<>();
    private static Scanner scanner=new Scanner(System.in);

    ChessGame(int rows, int cols) {
        this.board=Board.getBoardInstance(rows,cols);
    }

    public void addPlayer(String name,Color color){
        if(p1==null){
            p1=new Player(name,color);
        }else if(p2==null){
            p2=new Player(name,color);
        }else
            System.out.println("no more players can be added");
    }

    public void startGame(){
        playerQueue.add(p1);
        playerQueue.add(p2);
        while (winner==null){
            Player player = playerQueue.poll();
            System.out.println(player.name+", hey play your turn now...start to select your piece....");
            Cell selectCell=selectCell();
            while(selectCell.getPiece()==null || (selectCell.getPiece().color.color!=player.color.color) ){
                System.out.println("cannot select an empty piece, try again...");
                selectCell=selectCell();
            }
            int dest[]=selectDest();
            Move move =new Move(selectCell,dest,player);
            while (!selectCell.getPiece().validMove(move,board)){
                dest=selectDest();
                move =new Move(selectCell,dest,player);
            }
            makeMove(selectCell,dest,player);
            if(canBeWinner(dest,player)){
                winner=player;
                System.out.println("Winner winner chicken Dinner");
            }
            playerQueue.add(player);

        }
    }

    private Cell selectCell() {
        int r=scanner.nextInt();
        int c=scanner.nextInt();
        return board[r][c];
    }

    private boolean canBeWinner(int[] dest, Player player) {
        if((board[dest[0]][dest[1]].getPiece()) instanceof Knight && board[dest[0]][dest[1]].getPiece().color.color!=player.color.color){
            return true;
        }
        return false;
    }

    private void makeMove(Cell selectCell, int[] dest, Player player) {
    }

    private int[] selectDest() {
        int r=scanner.nextInt();
        int c=scanner.nextInt();
        return new int[]{r,c};
    }

}
