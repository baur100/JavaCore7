package hw10;

public class Skill {
    private String skillName;
    private int years;

    public Skill(String skillName, int years) {
        this.skillName = skillName;
        this.years = years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getSkillName() {
        return skillName;
    }

    public int getYears() {
        return years;
    }
}
