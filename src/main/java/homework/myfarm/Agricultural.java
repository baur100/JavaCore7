package homework.myfarm;

public class Agricultural {
    private String nameOfCulture;
    private int fieldNumber;

    public String getNameOfCulture() {
        return nameOfCulture;
    }

    public void setNameOfCulture(String nameOfCulture) {
        this.nameOfCulture = nameOfCulture;
    }

    public int getFieldNumber() {
        return fieldNumber;
    }

    public void setFieldNumber(int fieldNumber) {
        this.fieldNumber = fieldNumber;
    }

    public Agricultural(String nameOfCulture, int fieldNumber) {
        this.nameOfCulture = nameOfCulture;
        this.fieldNumber = fieldNumber;

    }

    @Override
    public String toString() {
        return "Agricultural{" +
                "nameOfCulture='" + nameOfCulture + '\'' +
                ", fieldNumber=" + fieldNumber +
                '}';
    }
}
