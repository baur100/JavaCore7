package hw15;

public class AgreeCulture1 {
    private String nameofCulture;
    private int fieldNumber;

    public AgreeCulture1(String nameofCulture, int fieldNumber) {
        this.nameofCulture = nameofCulture;
        this.fieldNumber = fieldNumber;
    }

    @Override
    public String toString() {
        return "AgreeCulture1{" +
                "nameofCulture='" + nameofCulture + '\'' +
                ", fieldNumber=" + fieldNumber +
                '}';
    }
}
