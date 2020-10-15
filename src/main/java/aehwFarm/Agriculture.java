package aehwFarm;

public class Agriculture {
    private String nameOfCrop;
    private int fieldNumber;

    public Agriculture(String nameOfCrop, int fieldNumber) {
        this.nameOfCrop = nameOfCrop;
        this.fieldNumber = fieldNumber;
    }

    public String getNameOfCrop() {
        return nameOfCrop;
    }

    public void setNameOfCrop(String nameOfCrop) {
        this.nameOfCrop = nameOfCrop;
    }

    public int getFieldNumber() {
        return fieldNumber;
    }

    public void setFieldNumber(int fieldNumber) {
        this.fieldNumber = fieldNumber;
    }

    @Override
    public String toString() {
        return fieldNumber + " field(s) of " + nameOfCrop;
    }
}
