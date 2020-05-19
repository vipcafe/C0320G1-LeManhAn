package B5.AdvancedObjectOrientedDesign.ThucHanh.Animals.animal;

import B5.AdvancedObjectOrientedDesign.ThucHanh.Animals.edible.Edible;

public class Tiger extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Tiger: roarrrrr!";
    }

    @Override
    public String howToEat() {
        return "Tiger nau cao ";
    }
}
