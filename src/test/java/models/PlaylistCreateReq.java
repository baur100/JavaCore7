package models;

public class PlaylistCreateReq {
    private String name;

    public PlaylistCreateReq(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
