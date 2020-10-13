package hwk13;

import java.util.Arrays;
import java.util.List;

public class SeasonOutfitCatalog extends Outfit{
    private String eventType;
    private boolean isItWindy;
    private Season season;
    
    public SeasonOutfitCatalog (List<Cloths> casual, List <Cloths> dressy, String eventType, boolean isItWindy, Season season ){
        super(casual,dressy);
        this.eventType = eventType;
        this.isItWindy = isItWindy;
        this.season = season;
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

    public String chooseOutfit(Season eventSeason) {
        if(season == Season.FALL || season == Season.WINTER ){
            System.out.println(dressy);
            return String.valueOf(dressy);
        }
        else
        {
            System.out.println(casual);
            return String.valueOf(casual);
        }
    }
}
