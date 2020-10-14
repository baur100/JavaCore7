package hwk13;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class SeasonOutfitCatalog {
    private Season season;
    private Accessories accessories;
    private Map<String,String> weather; // weather and night
    private boolean isItWindy;
    private Outfit outfit;

    public SeasonOutfitCatalog(Season season, Accessories accessories, Map<String, String> weather, boolean isItWindy, Outfit outfit) {
        this.season = season;
        this.accessories = accessories;
        this.weather = weather;
        this.isItWindy = isItWindy;
        this.outfit = outfit;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public Accessories getAccessories(){
        return accessories;
    }

    public void setAccessories(Accessories accessories){
        this.accessories = accessories;
    }

    public Map<String, String> getWeather() {
        return weather;
    }

    public void setWeather(Map<String, String> weather) {
        this.weather = weather;
    }

    public boolean isItWindy() {
        return isItWindy;
    }

    public void setItWindy(boolean itWindy) {
        isItWindy = itWindy;
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
                "season=" + season +
                ", accessories=" + accessories +
                ", weather=" + weather +
                ", isItWindy=" + isItWindy +
                '}';
    }
}
