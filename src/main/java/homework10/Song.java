package homework10;

public class Song {
    private String name;
    private String artist;
    private String album;
    private int length;

    public Song(){

    }

    public Song(String name, String artist, String album, int length){
        this.name = name;
        this.artist = artist;
        this.album = album;
        this.length = length;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getArtist(){
        return artist;
    }

    public void setArtist(String artist){
        this.artist = artist;
    }

    public String getAlbum(){
        return album;
    }

    public void setAlbum(String album){
        this.album = album;
    }

    public int getLength(){
        return length = length;
    }

    public void setLength(int length){
        this.length = length;
    }

    public void printInfo(){
        System.out.println("Currently playing: " + name);
    }

    public String showSongInfo(){
        return name + " by " + artist
                + " plays " + length + " seconds in " + album + ".";
    }
}
