package hwk13;

import java.util.Arrays;
import java.util.List;

public class Outfit {
    protected List<Cloths> casual;
    protected List<Cloths> dressy;

    public Outfit(List<Cloths> casual, List<Cloths> dressy) {
        this.casual = casual;
        this.dressy = dressy;
    }

    public List<Cloths> getCasual() {
        return casual;
    }

    public void setCasual(List<Cloths> casual) {
        this.casual = casual;
    }

    public List<Cloths> getDressy() {
        return dressy;
    }

    public void setDressy(List<Cloths> dressy) {
        this.dressy = dressy;
    }
}