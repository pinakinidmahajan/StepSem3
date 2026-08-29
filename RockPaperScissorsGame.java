import java.util.Random;

public class RockPaperScissorsGame {
    public static String playRound(String playerMove, String computerMove) {
        if (playerMove.equalsIgnoreCase(computerMove)) {
            return "Draw";
        }
        
        if ((playerMove.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Scissors")) ||
            (playerMove.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Rock")) ||
            (playerMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Paper"))) {
            return "Player Wins";
        } else {
            return "Computer Wins";
        }
    }

    public static void runGameSimulation(String[] playerMoves) {
        String[] moves = {"Rock", "Paper", "Scissors"};
        Random random = new Random();

        int totalRounds = playerMoves.length;
        int wins = 0;
        int losses = 0;
        int draws = 0;

        System.out.printf("%-10s | %-12s | %-14s | %-15s\n", "Round", "Player Move", "Computer Move", "Result");
        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < totalRounds; i++) {
            String playerMove = playerMoves[i];
            String computerMove = moves[random.nextInt(3)];
            String result = playRound(playerMove, computerMove);

            if (result.equals("Player Wins")) {
                wins++;
            } else if (result.equals("Computer Wins")) {
                losses++;
            } else {
                draws++;
            }

            System.out.printf("Round %-4d | %-12s | %-14s | %-15s\n", (i + 1), playerMove, computerMove, result);
        }

        double winPercentage = ((double) wins / totalRounds) * 100;
        System.out.printf("\nWins: %d | Losses: %d | Draws: %d | Win %% = %.1f%%\n", wins, losses, draws, winPercentage);
    }

    public static void main(String[] args) {
        String[] samplePlayerMoves = {"Rock", "Paper", "Scissors", "Rock", "Paper"};
        runGameSimulation(samplePlayerMoves);
    }
}