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
    private static GameState GAME_STATE = GameState.NOT_STARTED;

    @Override
    public void init() {
        currentPlayer = -1;
        ticTacToeBoard.init();
        GAME_STATE = GameState.STARTED;
    }

    public void play() {
        System.out.println("===========Started Game=================");
        init();
        while(!hasWinner() && !hasTie()) {
            updateCurrentPlayer();
            displayGameState();
            Player player = getNextPlayer();
            Move move = getNextMove(player);
            makeMove(move);
        }
        GAME_STATE = GameState.COMPLETED;
        if (hasWinner()) {
            Player winnerPlayer = getWinner();
            System.out.println("players.Player "  + winnerPlayer.getName() + " is the winner");
        }
        if (hasTie()) {
            System.out.println("Game is tied. No Winner!");
        }
    }

    private void updateCurrentPlayer() {
        currentPlayer = (currentPlayer + 1) % playerList.size();
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
        return false;
    }

    @Override
    Player getNextPlayer() {
        return playerList.get(currentPlayer);
    }

    @Override
    void move(Player player, Board board) {

    }

    @Override
    Player getWinner() {
        if (GAME_STATE != GameState.COMPLETED) {
            throw new IllegalStateException("Game has not started or is being played currently");
        }
        return playerList.get(currentPlayer);
    }
}
