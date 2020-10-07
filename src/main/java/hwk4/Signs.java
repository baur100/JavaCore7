package hwk4;

public class Signs {
    private String color;
    private String direction;
    private String drawing;

    public Signs(){}

    public Signs (String color, String direction, String drawing){
        this.color = color;
        this.direction = direction;
        this.drawing = drawing;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getDirection(){
        return direction;
    }

    public void setDirection(String direction){
        this.direction = direction;
    }

    public String getDrawing() {
        return drawing;
    }

    public void setDrawing(String drawing) {
        this.drawing = drawing;
    }

    public void printSignInfo(){
        System.out.println("The traffic sign I am lookign at is: " + color + " with a drawing of " +drawing+ "\n Its meaning is: " + direction);
    }
}
