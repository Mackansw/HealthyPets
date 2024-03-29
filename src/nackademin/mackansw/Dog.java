package nackademin.mackansw;

public class Dog extends Animal { //Polymorphism

    public Dog(String name, int weight, FoodTypes foodType) {
        super(name, weight, foodType);
    }

    @Override
    public double calculateFood() {
        super.calculateFood();
        return getWeight() / 100;
    }
}