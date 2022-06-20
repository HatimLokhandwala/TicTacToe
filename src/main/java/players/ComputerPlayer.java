package players;

public class ComputerPlayer extends Player {
    public ComputerPlayer() {
        this.name = "Computer";
    }

    @Override
    public String getName() {
        return name;
    }
}
