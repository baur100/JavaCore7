package homework11plus;

public class Keyboard {
    private String brand;
    private String model;
    private String connectionType;
    private String boardType;

    public Keyboard(String brand, String model, String connectionType, String boardType) {
        this.brand = brand;
        this.model = model;
        this.connectionType = connectionType;
        this.boardType = boardType;
    }

    public Keyboard(){

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    public String getBoardType() {
        return boardType;
    }

    public void setBoardType(String boardType) {
        this.boardType = boardType;
    }

    public String pullKeyboardInfo(){
        return "Keyboard: " + brand + " " + model
                + " " + connectionType + " " + boardType + "\r\n";
    }
}
