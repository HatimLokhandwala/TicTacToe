package players;

public class HumanPlayer extends Player {
    public HumanPlayer(String name) {
        this.name = name;
    }

    @Override
    String getName() {
        return this.name;
    }
}