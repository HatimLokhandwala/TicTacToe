package players;

public class ComputerPlayer extends Player {
    public ComputerPlayer() {
        this.name = "Computer";
    }

    @Override
    String getName() {
        return name;
    }
}
