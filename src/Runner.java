public class Runner {
    public static void main(String[] args) {
        Game game = new Game();
        game.increaseScore(10);
        game.increaseScore(7);
        game.addPlayer();
        game.increaseScore(3);
        System.out.println("A total of " + game.getPlayers() + " players contributed ot a score of "+ game.getScore() + " with an average of " + game.averageScorePerPlayer());
    }
}
