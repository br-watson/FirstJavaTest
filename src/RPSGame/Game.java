package RPSGame;

import java.util.Random;

public class Game {
    private Random rand = new Random();

    public Game() {

    }

    public String RPS(RPS input) {
        Boolean result = null;
        String output;
        int num = rand.nextInt(3);
        RPS computer = null;
        switch (num) {
            case 0:
                computer = RPS.ROCK;
                break;
            case 1:
                computer = RPS.PAPER;
                break;
            case 2:
                computer = RPS.SCISSORS;
                break;
        }
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
                    break;
            }
        }
        if (result == null)
            output = "Tie. :|";
        else if (result)
            output = "You Win! :)";
        else
            output = "You Lose :(";

        return output;
    }
}
