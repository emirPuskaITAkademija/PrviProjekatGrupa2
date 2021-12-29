package seven;

import six.oop.design.geometry.Circle;
import six.oop.design.geometry.Rectangle;
import six.oop.design.geometry.Shape;

public class Executor {

    public static void main(String[] args) {
        //circle -> circle ... x, y, boje, ime, poluprečnik
        //Shape, Circle -> polimorfizam..calculateArea
        Circle shape1 = new Circle(23, 23, "RED", "KRUŽIĆ", 23.0);
        consumeShape(shape1);
        //Shape, Rectangle
        Rectangle shape2 = new Rectangle(0, 0,"BLACK", "KVADRATIĆ", 20, 10);
        consumeShape(shape2);
    }

    private static void consumeShape(Shape shape){
        System.out.println("Površina = " + shape.calculateArea());  //Circle r2*PI  Rectangle
    }
}
