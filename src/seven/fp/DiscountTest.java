package seven.fp;

import six.oop.design.animal.Flyable;

/**
 *
 */
public class DiscountTest {
    public static void main(String[] args) {
        double amount = 1000;
        Discounter discounter1 = new EasterDiscounter();
        double discountedAmount1 = discounter1.applyDiscount(amount);
        System.out.println(discountedAmount1);
        Discounter discounter2 = new NewYearDiscounter();
        double discountedAmount2 = discounter2.applyDiscount(amount);
        System.out.println(discountedAmount2);

        //Anonymous INNER type
        Discounter discounter3 = (param)-> param-0.4*param;
        double result = discounter3.applyDiscount(amount);
        System.out.println(result);

        Flyable flyable = () -> System.out.println("Ja letim....");
        flyable.fly();
    }
}
