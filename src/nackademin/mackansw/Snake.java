package nackademin.mackansw;

public class Snake extends Animal { //Polymorfism

    public Snake(String name, int weight, FoodTypes foodType) {
        super(name, weight, foodType);
    }

    @Override
    public double calculateFood() {
        super.calculateFood();
        return super.calculateFood();
    }
}