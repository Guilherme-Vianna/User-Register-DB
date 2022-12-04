package Connection;

import java.sql.Connection;
import java.sql.Statement; 
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
 

/**
 *
 * @author mapublic ctav
 */
public class ConnectionCommands {
    Connection _con = null ; 
    Statement _stt = null; 
    
    
    public void Conector(){    
        try {
            _con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/dbinfoq",
                    "root",
                    "@Gui92720108");
        }catch(SQLException e){
            
        }
    }
    
    
    public void ReadData(){
        try {
            if(_stt == null){ 
                _stt = _con.createStatement();
                ResultSet result = _stt.executeQuery("SELECT * FROM tbclientes"); 
                while(result.next()){
                    String name = result.getString("nomecli"); 
                    System.out.println(name);
                }   
            }
        }catch(SQLException e){}
    }
}       
