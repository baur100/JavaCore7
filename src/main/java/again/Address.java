package again;



    public class Address {


        private String streetAddress;
        private String town;
        private String state;
        private int zip;

        public String getStreetAddress() {
            return streetAddress;
        }

        public void setStreetAddress(String streetAddress) {
            this.streetAddress = streetAddress;
        }

        public String getTown() {
            return town;
        }

        public void setTown(String town) {
            this.town = town;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public int getZip() {
            return zip;
        }

        public void setZip(int zip) {
            this.zip = zip;
        }

        public Address(String street, String town, String state, int zipcode) {
            this.streetAddress = street;
            this.town = town;
            this.state = state;
            this.zip = zipcode;




        }


    }
