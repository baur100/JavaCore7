package homework11;

public class Room {
    protected  int area_sq_m;

    public int getArea_sq_m() {
        return area_sq_m;
    }

    public String getColor() {
        return color;
    }

    public int getWindows() {
        return windows;
    }

    protected String color;
    protected int windows;

    public Room(int area, String color, int windows) {
        this.area_sq_m = area;
        this.color = color;
        this.windows = windows;
    }
}
