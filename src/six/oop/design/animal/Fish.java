package six.oop.design.animal;

import five.oo.Gender;

public class Fish extends Animal{
    public Fish(int uniqueId, String name, Gender gender) {
        super(uniqueId, name, gender);
    }

    @Override
    public void playSound() {
        System.out.println("Blb Blb..");
    }
}
