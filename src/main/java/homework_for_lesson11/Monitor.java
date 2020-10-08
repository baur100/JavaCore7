package homework_for_lesson11;

public class Monitor {
    private String typeOfMatrix;
    private double diagonal;
    private String bulb;
    private String decoder;

    public Monitor(String typeOfMatrix, double diagonal, String bulb, String decoder) {
        this.typeOfMatrix = typeOfMatrix;
        this.diagonal = diagonal;
        this.bulb = bulb;
        this.decoder = decoder;
    }

    public String getTypeOfMatrix() {
        return typeOfMatrix;
    }

    public void setTypeOfMatrix(String typeOfMatrix) {
        this.typeOfMatrix = typeOfMatrix;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public String getBulb() {
        return bulb;
    }

    public void setBulb(String bulb) {
        this.bulb = bulb;
    }

    public String getDecoder() {
        return decoder;
    }

    public void setDecoder(String decoder) {
        this.decoder = decoder;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "typeOfMatrix='" + typeOfMatrix + '\'' +
                ", diagonal=" + diagonal +
                ", bulb='" + bulb + '\'' +
                ", decoder='" + decoder + '\'' +
                '}';
    }
}
