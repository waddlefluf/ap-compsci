import java.util.Scanner;

public class Snake {

    public static void main(String[] args) {
        int p1Score = 0, p2Score = 0;
        int p1TurnScore = 0, p2TurnScore = 0;
        int player = 1;

        int tempTurnScore = 0;
        final int WIN_SCORE = 100;
        final int RESET_SCORE = 30;

        boolean rollChoice; // true = roll, false = hold
        boolean gameOver = false;


        rollChoice = askChoice(player);

        while (!gameOver) {                     // do until game ends
            if (rollChoice && !gameOver) {   // do until player chooses not to roll
                gameOver = checkWinner(p1Score, p2Score, WIN_SCORE);

                System.out.println("\nPlayer " + player + " roll:");

                int d1 = roll();
                int d2 = roll();

                System.out.printf("d1:\t%d\td2:\t%d\n", d1, d2);

                System.out.printf("Player 1 score:\t%d\tPlayer 2 score:\t%d\n" +
                        "Player 1 turn score:\t%d\tPlayer 2 turn score:\t%d\n", p1Score, p2Score, p1TurnScore, p2TurnScore);

                if (d1 == 1 && d2 == 1) {
                    tempTurnScore = 0;
                    player = switchPlayer(player);

                    rollChoice = false;
                } else if (d1 == 1 || d2 == 1) {
                    tempTurnScore++;
                    player = switchPlayer(player);

                    rollChoice = false;
                } else if (d1 == d2) {
                    tempTurnScore += (d1 + d2) * 2;
                } else {
                    tempTurnScore += d1 + d2;
                }

                if (player == 1) {
                    p1TurnScore = addTempScore(player, p1TurnScore, p2TurnScore, tempTurnScore);
                    p1Score = resetScore(tempTurnScore, RESET_SCORE);
                } else {
                    p2TurnScore = addTempScore(player, p1TurnScore, p2TurnScore, tempTurnScore);
                    p2Score = resetScore(tempTurnScore, RESET_SCORE);
                }

                rollChoice = askChoice(player);
            }

            // if hold, add turn score to score

            if (!rollChoice) {
                if (player == 1)
                    p1Score = addScore(player, p1Score, p1TurnScore, p2Score, p2TurnScore);
                else
                    p2Score = addScore(player, p1Score, p1TurnScore, p2Score, p2TurnScore);

                player = switchPlayer(player);
                rollChoice = askChoice(player);
            }
        }
    }

    static int roll() {
        return (int)(Math.random()*6) + 1;
    }

    static int switchPlayer(int player) {
        if (player == 1)
            player = 2;
        else
            player = 1;

        return player;
    }

    static boolean checkWinner(int score1, int score2, int winScore) {
        if (score1 >= winScore) {
            System.out.println("\n\nPlayer 1 wins!");
            return true;
        }

        if (score2 >= winScore) {
            System.out.println("\n\nPlayer 2 wins!");
            return true;
        }

        return false;
    }

    static int resetScore(int tempTurnScore, int resetCondition) {
        if (tempTurnScore > resetCondition) {
             return 0;
        } else {
            return tempTurnScore;
        }
    }

    static boolean botChoice() {
        return Math.random() < 0.5;
    }

    static boolean askChoice(int player) {
        Scanner input = new Scanner(System.in);

        if (player == 1) {
            System.out.println("\nCurrent player:\t" + player + "\nRoll? (y/n)");
            return input.nextLine().equals("y");
        } else {
            if (!botChoice())
                System.out.println("\nBot holds.");

            return botChoice();
        }
    }

    static int addTempScore(int player, int p1TurnScore, int p2TurnScore, int tempTurnScore) {
        if (player == 1) {
            p1TurnScore += tempTurnScore;
            return p1TurnScore;
        } else {
            p2TurnScore += tempTurnScore;
            return p2TurnScore;
        }
    }

    static int addScore(int player, int p1Score, int p1TurnScore, int p2Score, int p2TurnScore) {
        if (player == 1) {
            p1Score += p1TurnScore;
            return p1Score;
        } else {
            p2Score += p2TurnScore;
            return p2Score;
        }
    }

}
