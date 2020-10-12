package homework11;



    public class App {

        public static void main(String[] args) {
            Countries Russia = new Countries("Russia", 1700000, "Russian", "Christianity");
            Russia.info();
            Client  client1 = new Client (" Russian", "Muslim", 1, "Zarina", "Sharakhmetova");
            client1.greeting();

            Destination Moscow = new Destination("Moscow", 100000, "Russian", "Muslim", 500, 7);

            Moscow.confirmation();

        }

    }


