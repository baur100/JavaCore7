package hwk13;

import java.util.Arrays;
import java.util.List;

public class Outfit {
    private Tops top;
    private Bottoms bottoms;

    public Outfit(Tops top, Bottoms bottoms) {
        this.top = top;
        this.bottoms = bottoms;
    }

    public Tops getTop() {
        return top;
    }

    public Bottoms getBottoms() {
        return bottoms;
    }

    @Override
    public String toString() {
        return "Outfit{" +
                "top=" + top +
                ", bottoms=" + bottoms +
                '}';
    }
}