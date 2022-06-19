public abstract class BaseGame implements Game {
    public abstract void init();
    abstract Player getNextPlayer();
    abstract void move(Player player, Board board);
    abstract Player getWinner();
}