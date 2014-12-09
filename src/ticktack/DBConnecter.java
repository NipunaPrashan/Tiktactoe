package ticktack;
import java.sql.*;

public class DBConnecter {
    private static DBConnecter singleton = null;
    private Connection con;
    //private Statement st;
    //private ResultSet rs;
    
  public synchronized static DBConnecter getConnection(){
        if(singleton == null){
            singleton = new DBConnecter();
            return singleton;
        }
        else{
            return singleton;
        }
    }
    
    private DBConnecter(){
        
        try{
          //  Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tictactoe","root","");
           // st = con.createStatement();
            
            
        }
        catch(Exception ex){
            System.out.println("Error machan"+ex);
        }
    }
    
   

    Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } 

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }


    
}

