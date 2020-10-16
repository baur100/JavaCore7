package Lesson_16_HW;

import java.util.HashMap;
import java.util.List;

    public class Farm {
        private String name;
        private Address address;
        private HashMap<Cattle, Integer> cattleIntegerHashMap;
        private List<AgreeCultural> agreeCultural;
        private String nameOfCulture;
        private int fieldsNumber;


        public Farm(String name, Address address, HashMap<Cattle, Integer> cattleIntegerHashMap, List<AgreeCultural> agreeCultural, String nameOfCulture, int fieldsNumber) {
            this.name = name;
            this.address = address;
            this.cattleIntegerHashMap = cattleIntegerHashMap;
            this.agreeCultural = agreeCultural;
            this.nameOfCulture = nameOfCulture;
            this.fieldsNumber = fieldsNumber;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Address getAddress() {
            return address;
        }

        public void setAddress(Address address) {
            this.address = address;
        }

        public HashMap<Cattle, Integer> getCattleIntegerHashMap() {
            return cattleIntegerHashMap;
        }

        public void setCattleIntegerHashMap(HashMap<Cattle, Integer> cattleIntegerHashMap) {
            this.cattleIntegerHashMap = cattleIntegerHashMap;
        }

        public List<AgreeCultural> getAgreeCultural() {
            return agreeCultural;
        }

        public void setAgreeCultural(List<AgreeCultural> agreeCultural) {
            this.agreeCultural = agreeCultural;
        }

        public String getNameOfCulture() {
            return nameOfCulture;
        }

        public void setNameOfCulture(String nameOfCulture) {
            this.nameOfCulture = nameOfCulture;
        }

        public int getFieldsNumber() {
            return fieldsNumber;
        }

        public void printFarm() {
            System.out.println(name + address+nameOfCulture+fieldsNumber);
            printHashMap();
            printAgreeCult();
        }

        public void printHashMap() {
            for (Cattle c : cattleIntegerHashMap.keySet()) {
                System.out.println(c + "=>" + cattleIntegerHashMap.get(c));
            }
        }
        public void printAgreeCult(){
            for (AgreeCultural a: agreeCultural){
                System.out.println(a.agreeCultInfo());
            }
            }
                    }


