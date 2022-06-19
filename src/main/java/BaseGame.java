public abstract class BaseGame {
    abstract Player getNextPlayer();
    abstract void move(Player player, Board board);
    abstract Player getWinner();
}
