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

    public void displayBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("| " + symbolBoard[i][j]);
            }
            System.out.print("|");
            System.out.println("");
        }
    }

    public boolean isRowAcquired(final TicTacToeSymbol symbol) {
        for (int i = 0; i < size; i++) {
            int count = 0;
            for (int j = 0; j < size; j++) {
                if (symbolBoard[i][j] == symbol) {
                    count++;
                }
            }
            if (count == size) {
                return true;
            }
        }
        return false;
    }

     public boolean isColumnAcquired(final TicTacToeSymbol symbol) {
        for (int j = 0; j < size; j++) {
            int count = 0;
            for (int i = 0; i < size; i++) {
                if (symbolBoard[i][j] == symbol) {
                    count++;
                }
            }
            if (count == size) {
                return true;
            }
        }
        return false;
    }

    public boolean isDiagonalAcquired(final TicTacToeSymbol symbol) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (symbolBoard[i][i] == symbol) {
                count++;
            }
        }
        if (count == size) {
            return true;
        }
        count = 0;
        for (int i = 0; i < size; i++) {
            if (symbolBoard[i][size - i - 1] == symbol) {
                count++;
            }
        }
        return count == size;
    }
}
