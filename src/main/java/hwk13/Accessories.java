package hwk13;

public class Accessories {
    private String necklace;
    private String ristlette;
    private String watch;
    private String earrings;

    public Accessories(String necklace, String ristlette, String watch, String earrings) {
        this.necklace = necklace;
        this.ristlette = ristlette;
        this.watch = watch;
        this.earrings = earrings;
    }

    public String getNecklace() {
        return necklace;
    }

    public void setNecklace(String necklace) {
        this.necklace = necklace;
    }

    public String getRistlette() {
        return ristlette;
    }

    public void setRistlette(String ristlette) {
        this.ristlette = ristlette;
    }

    public String getWatch() {
        return watch;
    }

    public void setWatch(String watch) {
        this.watch = watch;
    }

    public String getEarrings() {
        return earrings;
    }

    public void setEarrings(String earrings) {
        this.earrings = earrings;
    }

    @Override
    public String toString() {
        return "Accessories{" +
                "necklace='" + necklace + '\'' +
                ", ristlette='" + ristlette + '\'' +
                ", watch='" + watch + '\'' +
                ", earrings='" + earrings + '\'' +
                '}';
    }
}
