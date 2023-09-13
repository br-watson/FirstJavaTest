package RPSGame;

import java.util.Random;

public class Game {
    private Random rand = new Random();

    public String RPSGame(RPS input) {
        Boolean result = null;
        int num = rand.nextInt(3);
        RPS computer = RPS.values()[num];
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
        }
        if (result == null)
            return "Tie. :|";
        else if (result)
            return "You Win! :)";
        else
            return "You Lose :(";
    }
}
