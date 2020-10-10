package homework13;

public class Dimensions {
    private Length length;
    private Length width;
    private Length height;

    public Dimensions(Length length, Length width, Length height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Length getLength() {
        return length;
    }

    public Length getWidth() {
        return width;
    }

    public Length getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return String.format("%s x %s x %s", length, width, height);
    }
}
