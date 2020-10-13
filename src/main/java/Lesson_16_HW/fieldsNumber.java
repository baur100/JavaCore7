package Lesson_16_HW;

public class fieldsNumber {
    private int fieldsNumber;

    public fieldsNumber() {
    }

    public fieldsNumber(int fieldsNumber) {
        this.fieldsNumber = fieldsNumber;
    }

    public int getFieldsNumber() {
        return fieldsNumber;
    }

    public void setFieldsNumber(int fieldsNumber) {
        this.fieldsNumber = fieldsNumber;
    }

    public String fields_info() {
        return "\nfieldsNumber1: + " +
                "\nfieldsNumber2: + " +
                "\nfieldsNumber3: + ";
    }
}
