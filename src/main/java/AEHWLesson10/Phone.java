package AEHWLesson10;

import java.util.Arrays;

public class Phone {
        private String brand;
        private String os;
        private int osVersion;
        private String[] apps;

        public Phone(){}

        public Phone(String brand, String os, int osVersion, String[] apps) {
            this.brand = brand;
            this.os = os;
            this.osVersion = osVersion;
            this.apps = apps;
        }

        public void somePhone(){
            System.out.println(brand+" "+os+" "+osVersion);
        }

    public void setApps(String[] apps) {
        this.apps = apps;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public String[] getApps() {
        return apps;
    }

    public void appsOnPhone(){
            System.out.println(brand + " has " + Arrays.toString(apps));
        }

    @Override
    public String toString() {
        return "Phone: " +
                "\nbrand= " + brand +
                "\nos= " + os +
                "\nosVersion= " + osVersion +
                "\napps= " + Arrays.toString(apps);
    }
}

