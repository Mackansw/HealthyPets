package nackademin.mackansw;

public class Cat extends Animal { //Polymorphism

    public Cat(String name, int weight, FoodTypes foodType) {
        super(name, weight, foodType);
    }

    @Override
    public double calculateFood() {
        super.calculateFood();
        return getWeight() / 150;
    }
}