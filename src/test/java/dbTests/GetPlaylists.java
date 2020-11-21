package dbTests;

import helpers.DbAdapter;
import models.Playlist;
import org.testng.annotations.Test;

public class GetPlaylists {
    @Test
    public void getAllPlaylists(){
        var playlists = DbAdapter.getAllPlaylist();

        for (Playlist pl : playlists){
            System.out.println(pl.getId()+ " "+  pl.getName());
        }
    }
    @Test
    public void getPlaylistById(){
        Playlist pl = DbAdapter.getPlaylistById("52");
        if(pl==null){
            System.out.println("no playlist found");
        } else {
            System.out.println(pl.getName());
        }
    }
}
