package RPSGame;

public class Runner {
    public static void main(String[] args) {
        Game game = new Game();
        for (int i = 0; i < 5; i++)
            System.out.println(game.RPSGame(RPS.ROCK));
    }
}
