package hw12;


public class App {
    public static void main(String[] args) {

        WashingMachine GE = new WashingMachine("GE", "GTW465", 650);
        WashingMachine Samsung = new WashingMachine("Samsung", "Super", 750);
        Dryer Bosch = new Dryer("Bosch", "300 Series", 989);
        Dryer Whirpool = new Dryer("Whirpool", "7.0 Cu ft", 599);

        GE.keepingSizeAndStandard();
        Samsung.keepingSizeAndStandard();
        Bosch.keepingSizeAndStandard();
        Whirpool.keepingSizeAndStandard();
    }

}
