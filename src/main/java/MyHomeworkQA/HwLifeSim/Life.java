package MyHomeworkQA.HwLifeSim;

interface Life {

    void sound();
    void eat();
    void reproduce();
    void die();
    void lookAtMe();


    interface Fungi {

    }

    interface Bacteria {

    }

    interface Plants {

    }

    interface Animals {

        public interface Vertebrates {

            public interface Reptiles {

            }

            public interface Fish {

            }

            public interface Amphibians {}

            public interface Birds {

                static void eat() {
                    System.out.println("I eat plants or animals, sometimes even carrion.");
                }

            }

            public interface Mammals {

            }

        }

        public interface Invertebrates {

            
        }

    }

}
