package DbKoel;

import helpers.DbAdapter;
import models.KoelUser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GetUsers {
    private final String HOST = "jdbc:mariadb://104.237.9.33:3306/dbkoel";
    private final String USER = "dbuser20";
    private final String PASS = "pa$$20";
    private Connection connection = null;

    List<KoelUser> users = new ArrayList<>();

    @BeforeMethod
    public void connect() {
        connection = DbAdapter.Connector(HOST, USER, PASS);
    }
    @AfterMethod
    public void result() {
        users.forEach(x-> System.out.println(x.getId() + " | " + x.getName() + " | " + x.getEmail()));
    }

    @Test
    public void getUsers() {
        try{
            Statement statement = connection.createStatement();
            ResultSet queryResponse = statement.executeQuery("SELECT * FROM users");

            while(queryResponse.next()) {
                int id = queryResponse.getInt("id");
                String name = queryResponse.getString("name");
                String email = queryResponse.getString("email");
                users.add(new KoelUser(id,name,email));
            }
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }
}
