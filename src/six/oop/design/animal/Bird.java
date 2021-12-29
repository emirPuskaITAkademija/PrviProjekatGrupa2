package six.oop.design.animal;

import five.oo.Gender;

/**
 * SOLID
 *
 * S ingle responsibilty
 * O pen/Closed
 * L iskov substituion principle
 * I n
 */
public class Bird extends Animal implements Flyable{
    public Bird(int uniqueId, String name, Gender gender) {
        super(uniqueId, name, gender);
    }

    @Override
    public void playSound() {
        System.out.println("Ćiu Ćiu");
    }

    @Override
    public void fly() {
        System.out.println("Ptica leti...");
    }
}
