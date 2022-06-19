package board;

public class TicTacToeBoard {
    private final TicTacToeSymbol[][] symbolBoard;
    private final int size;

    public TicTacToeBoard(final int size) {
        this.size = size;
        symbolBoard = new TicTacToeSymbol[size][size];
    }

    public void init() {
        System.out.println("Initializing board");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                symbolBoard[i][j] = TicTacToeSymbol.EMPTY;
            }
        }
    }
}
