package B5.AdvancedObjectOrientedDesign.ThucHanh.Animals.animal;
import B5.AdvancedObjectOrientedDesign.ThucHanh.Animals.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "Chicken could be fried";
    }
}

