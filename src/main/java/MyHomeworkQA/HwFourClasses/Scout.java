package MyHomeworkQA.HwFourClasses;

public class Scout {

        String rank;
        char sign;
        String weapon;

        public String displayScoutInfo(){
            return "Rank: "+rank+" | Designation: "+sign+" | Weapon: "+weapon;
        }

        public void setWeapon(String weapon) {
            this.weapon = weapon;
            System.out.println("Weapon has been changed");
        }

}
