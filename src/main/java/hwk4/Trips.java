package hwk4;

public class Trips {
    private String scenery;
    private String state;
    private String season;

    public Trips(String scenery, String state, String season) {
        this.scenery = scenery;
        this.state = state;
        this.season = season;
    }

    public Trips(){}

    public String getScenery() {
        return scenery;
    }

    public void setScenery(String scenery) {
        this.scenery = scenery;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public void printTripInfo(){
        System.out.println("Info for my next trip! /nDestination:" + scenery + "\nState:"+ state +"\nSeason:"+ season);
    }
}
