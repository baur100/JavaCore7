package Lesson_16_HW;

public class AgreeCultural {
    private String type;

    public AgreeCultural() {
    }

    public AgreeCultural(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

        public String agreeCultInfo() {
        return "AgreeCultural: " +
                "type: " + type;
    }
}
