package homework_for_lesson11;

public class CPU {
    private String storage;
    private String logicUnit;
    private String arithmeticUnit;

    public CPU(String storage, String logicUnit, String arithmeticUnit) {
        this.storage = storage;
        this.logicUnit = logicUnit;
        this.arithmeticUnit = arithmeticUnit;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getLogicUnit() {
        return logicUnit;
    }

    public void setLogicUnit(String logicUnit) {
        this.logicUnit = logicUnit;
    }

    public String getArithmeticUnit() {
        return arithmeticUnit;
    }

    public void setArithmeticUnit(String arithmeticUnit) {
        this.arithmeticUnit = arithmeticUnit;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "storage='" + storage + '\'' +
                ", logicUnit='" + logicUnit + '\'' +
                ", arithmeticUnit='" + arithmeticUnit + '\'' +
                '}';
    }
}
