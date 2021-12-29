package six.oop.design;

import six.oop.design.animal.Flyable;

public class Plane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Leti avion..");
    }
}
