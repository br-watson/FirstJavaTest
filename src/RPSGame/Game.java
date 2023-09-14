package RPSGame;

import java.util.Random;

public class Game {
    private final Random rand = new Random();

    public String RPSGame(RPS input) {
        boolean result = false;
        RPS computer = RPS.values()[rand.nextInt(3)];
        if (input != computer) {
            switch (input) {
                case ROCK:
                    result = computer != RPS.PAPER;
                    break;
                case PAPER:
                    result = computer != RPS.SCISSORS;
                    break;
                case SCISSORS:
                    result = computer != RPS.ROCK;
            }
        } else
            return "Tie. :|";
        if (result)
            return "You Win! :)";
        else
            return "You Lose :(";
    }
}
