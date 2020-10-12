package hwk13;

import java.util.Arrays;

public class Outfit {
    private Cloths[] casual = {Cloths.SHIRT, Cloths.JEANS};
    private Cloths[] dressy = {Cloths.DRESS, Cloths.CLUTCH};
    private Season season;

    public Outfit (Cloths[] casual, Cloths[] dressy, Season season){
        this.casual = casual;
        this.dressy = dressy;
        this.season = season;
    }

    public Cloths[] getCasual() {
        return casual;
    }

    public Cloths[] getDressy(){
        return dressy;
    }

    public Season getSeason() {
        return season;
    }

    public String chooseOutfit(Season eventSeason) {
        if(season == Season.FALL || season == Season.WINTER ){
            System.out.println(Arrays.toString(dressy));
            return String.valueOf(dressy);
        }
        else
        {
            System.out.println(Arrays.toString(casual));
            return String.valueOf(casual);
        }
    }

}
