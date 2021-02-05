package work;

public class BuildFamilyMember {

    public static void main(String[] args) {
        SharakhmetovFamily member1 = new SharakhmetovFamily("Vali", "Sharakhmetov", 62, "Dushanbe");


        SharakhmetovFamily member2 = new SharakhmetovFamily("Sofia", "Karimova", 56, "Dushanbe");


        SharakhmetovFamily member3 = new SharakhmetovFamily("Zarina", "Sharakhmetova", 27, "Dushanbe");


        SharakhmetovFamily member4 = new SharakhmetovFamily("Irina", "Sharakhmetova", 25, "Dushanbe");


        System.out.println(member1.FirstName + " " + " " + member2.FirstName + " " + " " + " " + member3.FirstName + " " + " " + member4.FirstName + " " + " " + "we are family");


    }


}