package homework_for_lesson11;

public class Keyboard {
    private String brand;
    private String color;
    private int size;

    public Keyboard(String brand, String color, int size) {
        this.brand = brand;
        this.color = color;
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
