package homework_for_lesson11;

public class RAM {
    private String type;
    private String module;

    public RAM(String type, String module) {
        this.type = type;
        this.module = module;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "type='" + type + '\'' +
                ", module='" + module + '\'' +
                '}';
    }
}
