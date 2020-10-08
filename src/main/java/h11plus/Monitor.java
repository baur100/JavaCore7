package h11plus;

public class Monitor {
    private String mmodel;
    private String mbrand;
    private String mmodel2;
    private String mbrand2;
    public boolean isadjust;

    public Monitor(String mmodel, String mbrand, String mmodel2, String mbrand2, boolean isadjust) {
        this.mmodel = mmodel;
        this.mbrand = mbrand;
        this.mmodel2 = mmodel2;
        this.mbrand2 = mbrand2;
        this.isadjust = isadjust;
    }

    public Monitor() {
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

    public String getMmodel2() {
        return mmodel2;
    }

    public void setMmodel2(String mmodel2) {
        this.mmodel2 = mmodel2;
    }

    public String getMbrand2() {
        return mbrand2;
    }

    public void setMbrand2(String mbrand2) {
        this.mbrand2 = mbrand2;
    }

    public boolean isIsadjust() {
        return isadjust;
    }

    public void setIsadjust(boolean isadjust) {
        this.isadjust = isadjust;
    }
}
