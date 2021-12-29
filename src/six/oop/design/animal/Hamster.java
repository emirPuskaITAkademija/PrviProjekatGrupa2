package six.oop.design.animal;

import five.oo.Gender;

public class Hamster extends Animal{
    public Hamster(int uniqueId, String name, Gender gender) {
        super(uniqueId, name, gender);
    }

    @Override
    public void playSound() {
        System.out.println("Hrk Hrk...");
    }
}
