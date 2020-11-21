package dbTests;

import helpers.DbAdapter;
import models.Artist;
import org.testng.annotations.Test;

import java.util.List;

public class GetArtists {
    @Test
    public void getAllArtists(){
        List<Artist> list = DbAdapter.getAllArtists();

        list.forEach(x-> System.out.println(x.getId() +
                " "+ x.getName() +" " + x.getImage()));
    }
}
