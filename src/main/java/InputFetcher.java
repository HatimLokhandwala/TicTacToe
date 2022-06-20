import players.Player;

import java.util.Scanner;

public class InputFetcher {
    private final Scanner scanner;

    public InputFetcher() {
        scanner = new Scanner(System.in);
    }

    int getInput(final Player player) {
        System.out.println("--Turn for " + player.getName());
        final String input = scanner.next();
        return Integer.parseInt(input);
    }
}
