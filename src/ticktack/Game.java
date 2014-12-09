package ticktack;

public class Game {

    private final Table gameBoard; // decalring the game board
    private Player player1, player2;

    public Game(Player player1, Player player2) {
        this.gameBoard = new Table();
        this.player1 = player1;
        this.player2 = player2;
    }

    public int isGameOver() {
        WinningCombinations[] wins;
        boolean finished = false;
        wins = gameBoard.getWinArray();
        //checks for the winner
        for (int i = 0; i < 8; i++) {
            try {
                if (wins[i].hasWin()) {
                    System.out.println("Winner: " + wins[i].whoWon());  //print the winner along with the symbol used
                    finished = true;
                    return wins[i].whoWon();
                }

            } catch (Exception e) {
            }

            if (gameBoard.isTableFull()) {
                System.out.println("Game ends\n But there is NO WINNER!");
                finished = true;
                return -1;
            }
        }
            return -2;
    }

    public void changePlayer() {
        Player temp = player1;
        player1 = player2;
        player2 = temp;
    }

    public Table getGameTable() {
        return gameBoard;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

}
