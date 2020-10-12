package aehwlesson15;

import java.util.ArrayList;
import java.util.Arrays;

public class Drive {
    private ArrayList<Direction> drive;

    public Drive(ArrayList<Direction> drive) {
        this.drive = drive;
    }

    public ArrayList<Direction> getDrive() {
        return drive;
    }

    public void setDrive(ArrayList<Direction> drive) {
        this.drive = drive;
    }

    @Override
    public String toString() {
        return "My car drives: " +
                "directions = " + drive;
    }
}
