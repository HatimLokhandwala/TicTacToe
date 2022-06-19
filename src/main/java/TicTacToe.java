import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class TicTacToe extends BaseGame{
    private final List<Player> playerList;
    private final Board board;
    private final Map<BoardCharacter, Player> characterPlayerMap;
    private int currentPlayer = 0;

    void play() {

        while(!hasWinner() && !hasTie()) {
            displayGameState();
            Player player = getNextPlayer();
            Move move = getNextMove(player);
            makeMove(move);
        }
    }

    private boolean hasWinner() {
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
