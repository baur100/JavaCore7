package AEHWLesson10;

public class House {
        private String state;
        private String city;
        private int price;


        public House(){}

        public House (String state, String city, int price) {
            this.state = state;
            this.city = city;
            this.price = price;
        }

        public void priceByState() {
            if (state == "CA") {
                if (price > 1000000) {
                    System.out.println("I love California :(");
                } else System.out.println("You are lucky!");
            }
        }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public void yourHome(){
        System.out.println(state + ", " + city);
    }
}
