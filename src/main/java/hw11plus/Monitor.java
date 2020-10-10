package hw11plus;

public class Monitor {
    private String mmodel;
    private String mbrand;
    public boolean isadjust;

    public Monitor(String mmodel, String mbrand, boolean isadjust) {
        this.mmodel = mmodel;
        this.mbrand = mbrand;
        this.isadjust = isadjust;
    }

    public String getMmodel() {
        return mmodel;
    }

    public void setMmodel(String mmodel) {
        this.mmodel = mmodel;
    }

    public String getMbrand() {
        return mbrand;
    }

    public void setMbrand(String mbrand) {
        this.mbrand = mbrand;
    }

    public boolean isIsadjust() {
        return isadjust;
    }

    public void setIsadjust(boolean isadjust) {
        this.isadjust = isadjust;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "mmodel='" + mmodel + '\'' +
                ", mbrand='" + mbrand + '\'' +
                ", isadjust=" + isadjust +
                '}';
    }
}
