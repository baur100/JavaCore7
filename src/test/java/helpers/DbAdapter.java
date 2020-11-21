package helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class DbAdapter {
    public static Connection Connector(String host, String user, String pass) {
        Connection connection = null;
        try {
            System.out.println("Trying connection");
            connection = DriverManager.getConnection(host, user, pass);
            System.out.println("Successfully connected");
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
        return connection;
    }
}
