package aehwlesson11;

public class Keyboard extends HardwareBrand {
    protected String keyboardModel;
    protected boolean isKeyboardWireless;

    public Keyboard(String brand, String keyboardModel, boolean isKeyboardWireless) {
        super(brand);
        this.keyboardModel = keyboardModel;
        this.isKeyboardWireless = isKeyboardWireless;
    }

    public String getKeyboardModel() {
        return keyboardModel;
    }

    public void setKeyboardModel(String keyboardModel) {
        this.keyboardModel = keyboardModel;
    }

    public boolean isKeyboardWireless() {
        return isKeyboardWireless;
    }

    public void setKeyboardWireless(boolean keyboardWireless) {
        isKeyboardWireless = keyboardWireless;
    }

    @Override
    public String toString() {
        return "Keyboard: " +
                "keyboardModel= " + keyboardModel +
                ", isKeyboardWireless= " + isKeyboardWireless +
                ", brand= " + brand;
    }
}
