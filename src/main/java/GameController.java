import players.ComputerPlayer;
import players.HumanPlayer;
import players.Player;

/**
 * GameController: main class that would trigger the various tic tac toe games
 */
public class GameController {
    public static void main(String[] args) {
        Player p1 = new HumanPlayer("");
        Player p2 = new ComputerPlayer();
        Board board = new Board();
    }
}
