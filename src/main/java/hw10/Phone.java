package hw10;

public class Phone {
    private String brand;
    private String model;
    private int year;
    private int storage;

    public Phone() {}

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) throws Exception {
        if (year > 2020 || year < 2000) {
            throw new Exception("Wrong year");
        }
        this.year = year;
    }
    public void setStorage(int storage) { this.storage = storage; }

    public String getBrand() { return this.brand; }
    public String getModel() {
        return this.model;
    }
    public int getYear() {
        return this.year;
    }
    public int getStorage() {
        return this.storage;
    }

    public void printInfo() {
        System.out.println("Phone: " +
                "\nBrand: " + brand +
                "\nmodel: " + model +
                "\nYear: " + year +
                "\nStorage: " + storage);
    }
}
