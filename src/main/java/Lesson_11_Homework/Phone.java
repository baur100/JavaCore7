package Lesson_11_Homework;

public class Phone extends Headset{
    private String[] phoneBinary;

    public Phone(String name, String make, String model, String[] phoneBinary) {
        super(name, make, model);
        this.phoneBinary = phoneBinary;
    }

    public Phone(String[] phoneBinary) {
        this.phoneBinary = phoneBinary;
    }

    public String[] getPhoneBinary() {
        return phoneBinary;
    }

    public void setPhoneBinary(String[] phoneBinary) {
        this.phoneBinary = phoneBinary;
    }
    public void printHPhone() {
        System.out.println("Phone}" + "\nName:" + name +
                "\nMake:" + make +
                "\nModel:" + model + "\n==============");
    }
}
