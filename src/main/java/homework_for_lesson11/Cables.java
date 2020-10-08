package homework_for_lesson11;

import java.util.Arrays;

public class Cables {
    private String [] models;

    public Cables(String[] models) {
        this.models = models;
    }

    public String[] getModels() {
        return models;
    }

    public void setModels(String[] models) {
        this.models = models;
    }

    @Override
    public String toString() {
        return "Cables{" +
                "models=" + Arrays.toString(models) +
                '}';
    }
}
