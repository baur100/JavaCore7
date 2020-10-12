package homework12;

public class App {
    public static void main(String[] args){
        // 2 object from each class
        IPhone iPhone7 = new IPhone();
        IPhone iPhoneX = new IPhone();
        Android pixel4 = new Android();
        Android galaxyFold = new Android();

        // Assign one object to interface
        Smartphone iPhone5 = new IPhone();
        Smartphone onePlus8 = new Android();

        iPhone7.usbcable();
        iPhoneX.usbcable();
        pixel4.usbcable();
        galaxyFold.usbcable();
        iPhone5.usbcable();
        onePlus8.usbcable();
    }
}
