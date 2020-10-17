package Lesson11Homework;
//use "extends" to create a child class.
public class PowerSupply extends ComputerManufacture {
    private int voltageInput;
    private int voltageOutput;
    public PowerSupply (String type, String brand, int cost, int voltageInput, int voltageOutput)
    //create extra variables if you like as ^^ then, create a "full constructor" of the class as ^^,
    // then use "super" to bring the "Super class/ parent class" attributes as below.
    {
        super(type, brand, cost);
        this.voltageInput = voltageInput;
        this.voltageOutput = voltageOutput;
    } // now below creates the setters and getters only for the additional variables you created.
    // If there is no other variable then only create a print method for the respective class, such as public void printPowerSupply

    public void setVoltageInput(int voltageInput)
    {
        this.voltageInput = voltageInput;
    }
    public int getVoltageInput()
    {
        return voltageInput;
    }
    public void setVoltageOutput(int voltageOutput)
    {
        this.voltageOutput = voltageOutput;
    }
    public int getVoltageOutput() {
        return voltageOutput;
    }
    public void printPowerSupply()
    {
        System.out.println(type + brand + cost + "\n The Input Voltage is " + voltageInput + "\n The Output Voltage is " + voltageOutput );
    }
}
