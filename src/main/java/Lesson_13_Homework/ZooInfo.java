package Lesson_13_Homework;

public class ZooInfo {
    private Animals animals;
    private Food food;
    private int capacity;

    public ZooInfo(Animals animals, Food food, int capacity) {
        this.animals = animals;
        this.food = food;
        this.capacity = capacity;
    }

    public ZooInfo() {

    }

    public Animals getAnimals() {
        return animals;
    }

    public void setAnimals(Animals animals) {
        this.animals = animals;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String zooInfo() {
        return "ZooInfo{" +
                "animals=" + animals +
                ", food=" + food +
                ", capacity=" + capacity +
                '}';
    }
}
