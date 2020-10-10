package homework13;

public class Parcel {
    private Weight weight;
    private Dimensions dimensions;
    private String sender;
    private String addressee;
    private Address toAddress;
    private Address fromAddress;

    public Parcel(Weight weight, Dimensions dimensions, String sender, String addressee, Address toAddress, Address fromAddress) {
        this.weight = weight;
        this.dimensions = dimensions;
        this.sender = sender;
        this.addressee = addressee;
        this.toAddress = toAddress;
        this.fromAddress = fromAddress;
    }

    public Weight getWeight() {
        return weight;
    }

    public Dimensions getDimentions() {
        return dimensions;
    }

    public String getSender() {
        return sender;
    }

    public String getAddressee() {
        return addressee;
    }

    public Address getToAddress() {
        return toAddress;
    }

    public Address getFromAddress() {
        return fromAddress;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    public void setDimentions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setAddressee(String addressee) {
        this.addressee = addressee;
    }

    public void setToAddress(Address toAddress) {
        this.toAddress = toAddress;
    }

    public void setFromAddress(Address fromAddress) {
        this.fromAddress = fromAddress;
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "weight=" + weight +
                ", dimensions=" + dimensions +
                ", sender='" + sender + '\'' +
                ", addressee='" + addressee + '\'' +
                ", toAddress=" + toAddress +
                ", fromAddress=" + fromAddress +
                '}';
    }
}

