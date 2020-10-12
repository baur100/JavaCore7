package MyHomeworkQA.HwCollections;


import java.util.HashMap;


public class AppTwo {

    public static void main(String[] args) {

        HashMap<String, String> showsAndCharacters = new HashMap<>();
        HashMap<Integer, String> weeklyWages = new HashMap<>();
        HashMap<Dog, Microchip> dogIds = new HashMap<>();


        showsAndCharacters.put("Dexter's Lab", "Dexter");
        showsAndCharacters.put("The Simpsons", "Homer Simpson");
        showsAndCharacters.put("Peanuts", "Charlie Brown");
        showsAndCharacters.put("South Park", "Eric Cartman");


        weeklyWages.put(600, "Groundskeeper");
        weeklyWages.put(760, "Security Officer");
        weeklyWages.put(885, "Security Supervisor");
        weeklyWages.put(1700, "Software Engineer");


        /*System.out.println(showsAndCharacters);
        showsAndCharacters.replace("The Simpsons", "Lisa Simpson");
        System.out.println(showsAndCharacters);
        System.out.println(showsAndCharacters.get("Peanuts"));
        showsAndCharacters.remove("South Park", "Eric Cartman");
        System.out.println(showsAndCharacters);
        showsAndCharacters.put("The Jetsons", "Elroy Jetson");
        System.out.println(showsAndCharacters+"\n");


        System.out.println(weeklyWages);
        weeklyWages.remove(885);
        weeklyWages.remove(600, "Groundskeeper");
        System.out.println(weeklyWages);
        weeklyWages.replace(760, "Security Officer","Security Guard I");
        System.out.println(weeklyWages);
        weeklyWages.put(805, "Security Guard II");
        weeklyWages.put(875, "Security Supervisor");
        System.out.println(weeklyWages);
        weeklyWages.entrySet().stream().forEach
                (entry-> System.out.println("Key : "+entry.getKey()+"   Value : "+entry.getValue()));*/


        Dog d1 = new Dog("Solo","Bernese Mountain Dog");
        Dog d2 = new Dog("Doobie Doo","Beagle Mix");
        Dog d3 = new Dog("Popeye","Cane Corso");
        Dog d4 = new Dog("Wario","Pekingnese");

        Microchip mic1 = new Microchip("USDAS8337494930203023", true);
        Microchip mic2 = new Microchip("USXQ03989303881389842", true);
        Microchip mic3 = new Microchip("USYJ93773937389232899", false);
        Microchip mic4 = new Microchip("USGR39849392812039098", false);

        dogIds.put(d1, mic1);
        dogIds.put(d2, mic2);
        dogIds.put(d3, mic3);
        dogIds.put(d4, mic4);

        //System.out.println(dogIds);
        dogIds.entrySet().stream().forEach
                (entry-> System.out.println("Key : "+entry.getKey()+"   Value : "+entry.getValue()));
    }
}
