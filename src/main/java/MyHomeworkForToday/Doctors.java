package MyHomeworkForToday;

import MyHomeworkForToday.Position;

public class Doctors {

    private String name;
    private String lastName;
    private Position position;



    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public void setPosition(Position position) {
        this.position = position;
    }

    public Doctors(String name, String lastname, Position pos) {
        this.name = name;
        this.lastName = lastname;
        this.position = pos;
    }

        public  void printInfo () {
        System.out.println(name + " " + lastName + " " + position);


        }
    }

