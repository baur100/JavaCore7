package MyHomeworkQA.TheHospital;

public class App {

    public static void main(String[] args) {

        Hospital vets = new Hospital("Veterans Memorial Hospital",
                new Address("1901 Kuykendahl Street", "Spring", "Texas", 77034));

        // Add rooms to hospital
        vets.addRoom(101, "Operating Room 1");
        vets.addRoom(102, "Operating Room 2");
        vets.addRoom(204, "Oncology Ward");
        vets.addRoom(228, "Pediatric Wing");
        vets.addRoom(411, "Emergency Room 1");
        vets.addRoom(474, "Pharmacy");

        // Add doctors to hospital
        vets.addDoctor(new Doctor("Doug", "Wilson", Position.PEDIATRICIAN));
        vets.addDoctor(new Doctor("Rhea", "Lazlo", Position.SURGEON));
        vets.addDoctor(new Doctor("Lesley", "Wade", Position.PHYSICIAN));

        // Add insurance to hospital
        vets.addInsurance(InsuranceCompany.AETNA);
        vets.addInsurance(InsuranceCompany.BLUECROSS);
        vets.addInsurance(InsuranceCompany.KAISER);
        vets.addInsurance(InsuranceCompany.HUMANA);
        vets.addInsurance(InsuranceCompany.ANTHEM);

        vets.printHospitalInfo();
        vets.printDoctors();
        vets.printRooms();
    }
}
