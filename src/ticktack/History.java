
package ticktack;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class History {
    
    private String player1;
    private String player2;
    private String player1St;
    private String player2St;
    private int type = -1;
    
    private static DBConnecter dbCon = DBConnecter.getConnection();
    private Statement st;
    private ResultSet rs;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

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
    
    public void saveData(String a, String b) {
        try {
            st = dbCon.getCon().createStatement();            
            String query1 = "INSERT INTO `tictactoe`.`users` (`Name`, `Status`, `Type`) VALUES ('" + player1 + "', '" + player1St + "','" + type + "')";
            st.executeUpdate(query1);
            
            String query2 = "INSERT INTO `tictactoe`.`users` (`Name`, `Status`, `Type`) VALUES ('" + player2 + "', '" + player2St + "','" + type + "')";
            st.executeUpdate(query2);
            System.out.println("Updated");

        } catch (SQLException ex) {
            System.out.println("Error 123");
        }
    }
    public void saveData(String a) {
        try {
            st = dbCon.getCon().createStatement();            
            String query1 = "INSERT INTO `tictactoe`.`users` (`Name`, `Status`, `Type`) VALUES ('" + player1 + "', '" + player1St + "','" + type + "')";
            st.executeUpdate(query1);
            System.out.println("Updated");

        } catch (SQLException ex) {
            System.out.println("Error 123");
        }
    }
    
    
}
