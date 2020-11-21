package helpers;

import models.Artist;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbAdapter {
    private static final String DB_URL = "jdbc:mariadb://104.237.9.33:3306/dbkoel";

    //  Database credentials
    private static final String USER = "dbuser06";
    private static final String PASS = "pa$$06";

    private static Connection connection = null;
    private static Statement statement = null;

    public static List<Artist> getAllArtists(){
        List<Artist> result = new ArrayList<>();
        String query = "SELECT * FROM artists a";
        try{
            connection = DriverManager.getConnection(DB_URL,USER,PASS);
            statement = connection.createStatement();

            ResultSet queryResponse = statement.executeQuery(query);

            while (queryResponse.next()){
               int id = queryResponse.getInt("id");
               String name = queryResponse.getString("name");
               String image = queryResponse.getString("image");
               Artist artist = new Artist(id,name,image);
               result.add(artist);
            }
        } catch (SQLException err){
            System.out.println(err.getMessage());
        }
        return result;
    }
}
