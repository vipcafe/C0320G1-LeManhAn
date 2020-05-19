package B5.AdvancedObjectOrientedDesign.ThucHanh.Animals;

import B5.AdvancedObjectOrientedDesign.ThucHanh.Animals.animal.Animal;
import B5.AdvancedObjectOrientedDesign.ThucHanh.Animals.animal.Chicken;
import B5.AdvancedObjectOrientedDesign.ThucHanh.Animals.animal.Tiger;
import B5.AdvancedObjectOrientedDesign.ThucHanh.Animals.edible.Edible;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        Edible eat = (Edible) animals[0];
        System.out.println(eat.howToEat());
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                Edible edibler = (Edible) animal;
                System.out.println(edibler.howToEat());
            }
        }
    }
}
