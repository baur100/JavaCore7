package models;

public class PlaylistCreateRequest {
    private String name;

    public PlaylistCreateRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
