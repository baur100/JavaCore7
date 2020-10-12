package hwk13;

import java.util.Arrays;

public class SeasonOutfitCatalog {
    String eventType;
    boolean isItWindy;
    Season season;
    Outfit outfit;
    
    public SeasonOutfitCatalog (String eventType,boolean isItWindy,Season season,Outfit outfit){
        this.eventType = eventType;
        this.isItWindy = isItWindy;
        this.season = season;
        this.outfit = outfit;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public boolean isItWindy() {
        return isItWindy;
    }

    public void setItWindy(boolean itWindy) {
        isItWindy = itWindy;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public Outfit getOutfit() {
        return outfit;
    }

    public void setOutfit(Outfit outfit) {
        this.outfit = outfit;
    }



    @Override
    public String toString() {
        return "SeasonOutfitCatalog{" +
                "eventType='" + eventType + '\'' +
                ", isItWindy=" + isItWindy +
                ", season=" + season +
                ", outfit=" + outfit +
                '}';
    }
}
