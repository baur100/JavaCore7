package homework_for_lesson14;

public class InsuranceCompanies {
    private Insurance insurance;

    public InsuranceCompanies(Insurance insurance) {
        this.insurance = insurance;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    @Override
    public String toString() {
        return "InsuranceCompanies{" +
                "insurance=" + insurance +
                '}';
    }
}
