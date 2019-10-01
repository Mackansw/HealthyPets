package nackademin.mackansw;

import javax.swing.*;

public class HealthyPets {

    private Dog d1 = new Dog("Sixten", 5, FoodTypes.Dogfood);
    private Dog d2 = new Dog("Dogge", 10, FoodTypes.Dogfood);
    private Cat c = new Cat("Venus", 5, FoodTypes.Catfood);
    private Snake s = new Snake("Hypno", 1, FoodTypes.Snakepellet);

    private void startInputDialog() {
        boolean dialog = true;
        while(dialog) {

            String input = JOptionPane.showInputDialog("Which animal should be fed?");

            try {
                if(input.equals(d1.getName())) {
                    JOptionPane.showMessageDialog(null, d1.getName() + " should have " + d1.calculateFood() + "g " + d1.getFoodType() + "!");
                    dialog = false;
                }
                else if(input.equals(d2.getName())) {
                    JOptionPane.showMessageDialog(null, d2.getName() + " should have " + d2.calculateFood() + "g " + d2.getFoodType() +  "!");
                    dialog = false;
                }
                else if(input.equals(c.getName())) {
                    JOptionPane.showMessageDialog(null, c.getName() + " should have " + c.calculateFood() + "g " + c.getFoodType() + "!");
                    dialog = false;
                }
                else if(input.equals(s.getName())) {
                    JOptionPane.showMessageDialog(null, s.getName() + " should have " + s.calculateFood() + "g " + s.getFoodType() + "!");
                    dialog = false;
                }
                else {
                    JOptionPane.showMessageDialog(null, input + " matched no animal!");
                }
            }
            catch(NullPointerException e) {
                dialog = false;
            }
        }
    }

    public static void main(String args[]) {
        new HealthyPets().startInputDialog();
    }
}
