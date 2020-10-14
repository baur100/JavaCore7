package hwk13;

import java.util.*;

public class AppEnumsInheritance {
    public static void main(String[] args) {

        Accessories blueAccessories = new Accessories("necklace", "cuff", "watch", "earrings");
        Outfit dressy = new Outfit(Tops.SHALL,Bottoms.DRESS);
        Outfit casual = new Outfit(Tops.T_SHIRT,Bottoms.JEANS);
        Map<String,String> weather = new HashMap<>();
        weather.put("70 degrees", "At night event");
        List<Season> confirmedEventList = new ArrayList<>();
        confirmedEventList.add(Season.FALL);
        confirmedEventList.add(Season.SUMMER);

        SeasonOutfitCatalog catalogEntry = new SeasonOutfitCatalog(Season.FALL, blueAccessories, weather, false, dressy);
        System.out.println(catalogEntry);

    }

}
