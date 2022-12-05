package Connection;

import java.sql.Connection;
import java.sql.Statement; 
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JFrame;  
 

/**
 *
 * @author mapublic ctav
 */
public class ConnectionCommands {
    static Connection _con = null ; 
    static Statement _stt = null;
    
    
    public Connection CreateConnection(){    
        try {
            _con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/dbinfoq",
                    "root",
                    "@Gui92720108");
            }catch(SQLException e){
        }
        return _con; 
    }
    
    public void ReadData() throws SQLException{
        VerifyStatement();
        ResultSet result = _stt.executeQuery("SELECT * FROM tbclientes"); 
        while(result.next()){
            String name = result.getString("nomecli"); 
            System.out.println(name);
        }
    }
    
    private void VerifyStatement() throws SQLException{
        if(_stt == null){ 
            CreateStatement();
        }
    }
    
    private void CreateStatement() throws SQLException{
        _stt = _con.createStatement();
    }
    
}       
