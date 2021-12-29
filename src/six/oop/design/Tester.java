package six.oop.design;

import five.oo.Gender;
import six.oop.design.animal.*;
import six.oop.design.human.Penzioner;
import six.oop.design.human.Person;
import six.oop.design.human.Profesor;
import six.oop.design.human.Student;

/**
 * <p> DRY- DOn't Repeat Yourself</p>
 * <p> SINGLE source of truth</p>
 * <p>Open/Close -> Open for extension Closed for modification</p>
 */
public class Tester {

    public static void main(String[] args) {
        Person person = new Student();
        Cat cat = new Cat(1212, "Tom", Gender.MALE);
        person.setAnimal(cat);

        Bird bird = new Bird(1212, "Bla Bla", Gender.FEMALE);
        bird.fly();
    }
}
