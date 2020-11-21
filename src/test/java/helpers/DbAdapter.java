package helpers;

import com.sun.istack.Nullable;
import models.Artist;
import models.Playlist;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbAdapter {
    private static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
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
            Class.forName(JDBC_DRIVER);
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
        } catch (SQLException | ClassNotFoundException err){
            System.out.println(err.getMessage());
        } finally {
            if(connection!=null){
                try {
                    connection.close();
                } catch (SQLException err){
                    System.out.println(err.getMessage());
                }
            }
        }
        return result;
    }
    public static List<Playlist> getAllPlaylist(){
        List<Playlist> playlists = new ArrayList<>();
        String query = "SELECT * FROM playlists WHERE user_id = 76;";
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL,USER,PASS);
            statement = connection.createStatement();

            ResultSet queryResponse = statement.executeQuery(query);
            while (queryResponse.next()){
                int id = queryResponse.getInt("id");
                String name = queryResponse.getString("name");
                Playlist pl = new Playlist(name,id);
                playlists.add(pl);
            }

        } catch (ClassNotFoundException | SQLException err) {
            System.out.println(err.getMessage());
        } finally {
            if(connection!=null){
                try {
                    connection.close();
                } catch (SQLException err){
                    System.out.println(err.getMessage());
                }
            }
        }

        return playlists;
    }

    public static Playlist getPlaylistById(String playlistId) {
        @Nullable
        Playlist results = null;
        String query = "SELECT * FROM playlists p where user_id = 76 and id="+playlistId;
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL,USER,PASS);
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            if(!resultSet.next()){
                return null;
            } else {
                int id =  Integer.parseInt(playlistId);
                String name = resultSet.getString("name");
                results = new Playlist(name,id);
            }
        } catch (ClassNotFoundException | SQLException ee){
            System.out.println(ee.getMessage());
        } finally {
            if(connection!=null){
                try{
                    connection.close();
                } catch (SQLException ee) {
                    System.out.println(ee.getMessage());
                }
            }
        }
        return results;
    }
}
