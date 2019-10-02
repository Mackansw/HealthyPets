package nackademin.mackansw;

import javax.swing.*;

public class HealthyPets {

    //Encapsulation
    private Dog d1 = new Dog("Sixten", 5, FoodTypes.Dogfood);
    private Dog d2 = new Dog("Dogge", 10, FoodTypes.Dogfood);
    private Cat c = new Cat("Venus", 5, FoodTypes.Catfood);
    private Snake s = new Snake("Hypno", 1, FoodTypes.Snakepellet);

    /**
     * Takes input and checks if it matches an animal
     */
    private void startInputDialog() {
        String output = "";
        boolean dialog = true;

        while(dialog) {

            String input = JOptionPane.showInputDialog("Which animal should be fed?");

            if(input == null) {
                dialog = false;
            }
            else {
                if(input.equals(d1.getName())) {
                    output = d1.getName() + " should have " + d1.calculateFood() + "g " + d1.getFoodType() + "!";
                    dialog = false;
                }
                else if(input.equals(d2.getName())) {
                    output = d2.getName() + " should have " + d2.calculateFood() + "g " + d2.getFoodType() + "!";
                    dialog = false;
                }
                else if(input.equals(c.getName())) {
                    output = c.getName() + " should have " + c.calculateFood() + "g " + c.getFoodType() + "!";
                    dialog = false;
                }
                else if(input.equals(s.getName())) {
                    output = s.getName() + " should have " + s.calculateFood() + "g " + s.getFoodType() + "!";
                    dialog = false;
                }
                else {
                    output = input + " matches no animal!";
                }
            }
        }
        JOptionPane.showMessageDialog(null, output);
    }

    public static void main(String args[]) {
        new HealthyPets().startInputDialog();
    }
}