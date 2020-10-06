package homework_for_lesson11c;

public class Main {
    public static void main(String[] args) {
        Music music = new Music ("Ann",23);
        Music hiphop = new Hiphop("Alex",15,"hip-hop");
        Music classic  = new Classic ("Natalie",35,"Paris");

        Music [] singers = {music,hiphop,classic};
        for(Music v: singers){
            v.sing();
        }
    }
}
