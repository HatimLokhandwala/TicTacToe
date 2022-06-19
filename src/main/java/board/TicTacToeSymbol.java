package board;

public enum TicTacToeSymbol {
    X('x'),
    O('o'),
    EMPTY('_');
    private final char symbolChar;

    TicTacToeSymbol(final char symbolChar) {
        this.symbolChar = symbolChar;
    }

}
