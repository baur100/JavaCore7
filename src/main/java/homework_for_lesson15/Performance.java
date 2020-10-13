package homework_for_lesson15;

public class Performance {

    private String type;

    public Performance(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Performance:" + type ;

    }
}
