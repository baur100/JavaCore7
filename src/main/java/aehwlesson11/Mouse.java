package aehwlesson11;

public class Mouse extends HardwareBrand{
    protected String mouseModel;
    protected boolean isMouseWireless;

    public Mouse(String brand, String mouseModel, boolean isMouseWireless) {
        super(brand);
        this.mouseModel = mouseModel;
        this.isMouseWireless = isMouseWireless;
    }


    public String getMouseModel() {
        return mouseModel;
    }

    public void setMouseModel(String mouseModel) {
        this.mouseModel = mouseModel;
    }


    public boolean isMouseWireless() {
        return isMouseWireless;
    }

    public void setMouseWireless(boolean mouseWireless) {
        isMouseWireless = mouseWireless;
    }
}
