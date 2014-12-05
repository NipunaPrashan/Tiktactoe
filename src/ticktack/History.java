
package ticktack;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class History {
    
    private String player1 = null;
    private String player2 = null;
    private String player1St = null;
    private String player2St = null;
    private static DBConnecter dbCon = DBConnecter.getConnection();
    private Statement st;
    private ResultSet rs;

    public void setPlayer1(String player1) {
        this.player1 = player1;
    }

    public void setPlayer2(String player2) {
        this.player2 = player2;
    }

    public String getPlayer1() {
        return player1;
    }

    public void setPlayer1St(String player1St) {
        this.player1St = player1St;
    }

    public void setPlayer2St(String player2St) {
        this.player2St = player2St;
    }

    public String getPlayer2() {
        return player2;
    }
    
    public void saveData() {
        try {
            st = dbCon.getCon().createStatement();
            String query = "INSERT INTO `users` (`User_Id`, `Player_1`, `Player1_Status`, `Player_2`, `Player2_Status`) VALUES ('', '" + player1 + "', '" + player1St + "','" + player2 + "','" + player2St + "' )";
            st.executeUpdate(query);
            //System.out.println("Updated");

        } catch (SQLException ex) {
            System.out.println("Error 123");
        }
    }

    
    
}
