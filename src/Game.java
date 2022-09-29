public class Game
{
    private int players;
    private int score;
    private boolean gameOver;

    public Game()
    {
        players = 1;
        score = 0;
        gameOver = false;
    }

    public int getPlayers()
    {
        return players;
    }

    public int getScore()
    {
        return score;
    }

    public int addPlayer()
    {
        players ++;
        return players;
    }

    public void increaseScore(int increase)
    {
        score += increase;
    }


    public double  averageScorePerPlayer()
    {
        double avg = (double) score / players;
        return avg;
    }

    public void end()
    {
        gameOver = true;
    }
}
