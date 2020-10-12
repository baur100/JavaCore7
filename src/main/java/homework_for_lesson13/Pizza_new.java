package homework_for_lesson13;

public class Pizza_new {

    private String name;
    private Size size;
    private Type type;

    public Pizza_new(String name, Size size, Type type) {
        this.name = name;
        this.size = size;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "We serve a new Pizza -" + " " + name + ",size -" + " " +size + " "+ ",type -" + type + "."
        ;
    }
}

