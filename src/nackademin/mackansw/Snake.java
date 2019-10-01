package nackademin.mackansw;

public class Snake extends Animal {

    public Snake(String name, int weight, FoodTypes foodType) {
        super(name, weight, foodType);
    }

    @Override
    public double calculateFood() {
        super.calculateFood();
        return 20;
    }
}