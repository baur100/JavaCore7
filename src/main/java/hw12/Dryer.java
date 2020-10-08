package hw12;

public class Dryer implements StartButton {
    private String dbrand;
    private String dmodel;
    private int dprice;

    public Dryer(String dbrand, String dmodel, int dprice) {
        this.dbrand = dbrand;
        this.dmodel = dmodel;
        this.dprice = dprice;
    }

    public String getDbrand() {
        return dbrand;
    }

    public void setDbrand(String dbrand) {
        this.dbrand = dbrand;
    }

    public String getDmodel() {
        return dmodel;
    }

    public void setDmodel(String dmodel) {
        this.dmodel = dmodel;
    }

    public int getDprice() {
        return dprice;
    }

    public void setDprice(int dprice) {
        this.dprice = dprice;
    }


    public void keepingSizeAndStandard() {
        System.out.println("I use a push button start for my dryer");
    }

}
