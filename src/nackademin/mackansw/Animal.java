package nackademin.mackansw;

public class Animal implements IEat {

    private String name;
    private double weight;
    private FoodTypes foodType;

    public Animal(String name, double weight, FoodTypes foodType) {
        this.name = name;
        this.weight = weight;
        this.foodType = foodType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setFoodType(FoodTypes foodType) {
        this.foodType = foodType;
    }

    public FoodTypes getFoodType() {
        return this.foodType;
    }

    @Override
    public double calculateFood() {
        return 0;
    }
}