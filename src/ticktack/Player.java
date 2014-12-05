package ticktack;



/* Decalrig the characteristics of the players in the game */
public class Player {
    
    private String userName;
    private int userSymbol;  // 1='X' and 0='O'
    private Player opponent;
    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public Player(String name, int symbol){
        this.userName = name; 
        this.userSymbol = symbol; 
    }
    
    /* the default action of the user */
    public void play(Table table){
        table.selectTheCell(x, y, userSymbol);
    }

    public Player getOpponent() {
        return opponent;
    }

    public void setOpponent(Player opponent ){
        this.opponent = opponent;
    }
    
    public String getName() {
        return userName;
    }

    public void setName(String name) {
        this.userName = name;
    }

    public int getUserSymbol() {
        return userSymbol;
    }

    public void setUserSymbol(int symbol) {
        this.userSymbol = symbol;
    }
    
    
}
