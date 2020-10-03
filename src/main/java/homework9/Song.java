package homework9;

public class Song {
    public String name;
    public String artist;
    public String album;
    public int length;

    public void playSong(){
        System.out.println("Play song" + name + " by " + artist);
    }

    public String getSongInfo(){
        return name + " by " + artist
                + " plays " + length + " seconds in " + album + ".";
    }
}
