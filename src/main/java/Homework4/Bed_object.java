package Homework4;

public class Bed_object {
    public static void main(String[] args) {

        Bed bed = new Bed();
        bed.setName("bed");
        bed.setSize("king");
        bed.setHeight(14);

        String name = bed.getName();
        String size = bed.getSize();
        int height = bed.getHeight();

        System.out.println(height);
        System.out.println("This beautiful" + " " +
                size + " " + name + " " + "is" + " " +
                height + " " + "inch");

    }
}
