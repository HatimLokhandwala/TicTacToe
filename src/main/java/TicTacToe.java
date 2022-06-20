import board.TicTacToeBoard;
import board.TicTacToeSymbol;
import lombok.Builder;
import lombok.Data;
import players.Player;

import java.util.List;

@Data
@Builder
public class TicTacToe extends BaseGame{
    private final List<Player> playerList;
    private final TicTacToeBoard ticTacToeBoard;
    private final List<TicTacToeSymbol> symbols;
    private final InputFetcher inputFetcher;
    private int currentPlayer;

    @Override
    public void init() {
        currentPlayer = 0;
        ticTacToeBoard.init();
    }

    public void play() {
        init();
        System.out.println("===========Started Game=================");
        while(!hasWinner() && !hasTie()) {
            displayGameState();
            Player player = getNextPlayer();
            Move move = getNextMove(player);
            makeMove(move);
        }
        if (hasWinner()) {
            Player winnerPlayer = getWinner();
            System.out.println("players.Player "  + winnerPlayer.getName() + " is the winner");
        }
        if (hasTie()) {
            System.out.println("Game is tied. No Winner!");
        }
    }

    private Move getNextMove(final Player player) {
        int cellNumber = inputFetcher.getInput(player);
        return new Move(cellNumber);
    }

    private void displayGameState() {
        ticTacToeBoard.displayBoard();
    }

    private boolean hasWinner() {
        TicTacToeSymbol currentSymbol = symbols.get(currentPlayer);
        return ticTacToeBoard.isRowAcquired(currentSymbol)
                && ticTacToeBoard.isColumnAcquired(currentSymbol)
                && ticTacToeBoard.isDiagonalAcquired(currentSymbol);
    }

    private boolean hasTie() {
    }

    @Override
    Player getNextPlayer() {
        final Player player = playerList.get(currentPlayer);
        currentPlayer = 1 - currentPlayer;
        return player;
    }

    @Override
    void move(Player player, Board board) {

    }

    @Override
    Player getWinner() {
        return null;
    }
}
