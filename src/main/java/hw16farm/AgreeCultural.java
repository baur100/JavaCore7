package hw16farm;

public class AgreeCultural {
    private String nameOfCulture;
    private int fielsNumber;

    public AgreeCultural(String nameOfCulture, int fielsNumber) {
        this.nameOfCulture = nameOfCulture;
        this.fielsNumber = fielsNumber;
    }

    @Override
    public String toString() {
        return "AgreeCultural{" +
                "nameOfCulture='" + nameOfCulture + '\'' +
                ", fielsNumber=" + fielsNumber +
                '}';
    }
}
