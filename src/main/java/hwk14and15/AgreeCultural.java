package hwk14and15;

public class AgreeCultural {
    private String nameOfCulture; //Wheet, Soya, Pea
    private int fieldsNumber;

    public AgreeCultural(String nameOfCulture,int fieldsNumber){
        this.nameOfCulture = nameOfCulture;
        this.fieldsNumber = fieldsNumber;

    }

    public String getNameOfCulture() {
        return nameOfCulture;
    }

    public void setNameOfCulture(String nameOfCulture) {
        this.nameOfCulture = nameOfCulture;
    }

    public int getFieldsNumber() {
        return fieldsNumber;
    }

    public void setFieldsNumber(int fieldsNumber) {
        this.fieldsNumber = fieldsNumber;
    }

    public void printInfo(){
        System.out.println("AgreeCultural= \nquantity: " + fieldsNumber+ " nameOfCulture: "
                + nameOfCulture);

    }
}
