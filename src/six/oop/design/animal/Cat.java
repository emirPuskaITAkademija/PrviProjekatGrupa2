package six.oop.design.animal;

import five.oo.Gender;

public class Cat extends Animal{


    public Cat(int uniqueId, String name, Gender gender) {
        super(uniqueId, name, gender);
    }

    @Override
    public void playSound() {
        System.out.println("Meow Meow..");
    }
}
