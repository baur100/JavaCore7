package h11plus;

public class SystemBlock {
    private String sdevice;
    private String smodel;
    private String sbrand;

    public SystemBlock(String sdevice, String smodel, String sbrand) {
        this.sdevice = sdevice;
        this.smodel = smodel;
        this.sbrand = sbrand;
    }

    public SystemBlock() {
    }

    public String getSdevice() {
        return sdevice;
    }

    public void setSdevice(String sdevice) {
        this.sdevice = sdevice;
    }

    public String getSmodel() {
        return smodel;
    }

    public void setSmodel(String smodel) {
        this.smodel = smodel;
    }

    public String getSbrand() {
        return sbrand;
    }

    public void setSbrand(String sbrand) {
        this.sbrand = sbrand;
    }

    //    Motherboard
//    CPU
//            Harddrive
//    System Fan
}
