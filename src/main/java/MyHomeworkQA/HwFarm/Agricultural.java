package MyHomeworkQA.HwFarm;



public class Agricultural {

    private String cropName;
    private int amountOfCrop;


    public Agricultural(String cropName, int amountOfCrop) {
        this.cropName = cropName;
        this.amountOfCrop = amountOfCrop;
    }

    @Override
    public String toString() {
        return cropName + " Qty: " + amountOfCrop;
    }

}
