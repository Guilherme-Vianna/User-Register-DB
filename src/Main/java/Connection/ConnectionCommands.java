package Connection;

import java.sql.*;

public class ConnectionCommands {
    public static Connection _con = null;
    static Statement _stt = null;

    public ConnectionCommands() {
    }

    public Connection CreateConnection() {
        try {
            _con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbinfoq", "root", "@Gui92720108");
        } catch (SQLException var2) {
        }

        return _con;
    }

    public void ReadData() throws SQLException {
        this.VerifyStatement();
        ResultSet result = _stt.executeQuery("SELECT * FROM tbclientes");

        while(result.next()) {
            String name = result.getString("nomecli");
            System.out.println(name);
        }

    }

    private void VerifyStatement() throws SQLException {
        if (_stt == null) {
            this.CreateStatement();
        }
    }

    private void CreateStatement() throws SQLException {
        _stt = _con.createStatement();
    }
}
