package AEHWLesson9;

import java.util.Arrays;

public class Phone {
    public String brand;
    public String os;
    public int osVersion;
    public String[] apps;

    public void somePhone(){
        System.out.println(brand+" "+os+" "+osVersion);
    }

    public void appsOnPhone(){
        System.out.println(Arrays.toString(apps));
    }

}
