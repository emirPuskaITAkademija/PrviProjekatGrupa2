package five.oop;

public class Esspresso extends Beverage{
    public Esspresso() {
        super("Esspreso");
    }

    @Override
    public double cost() {
        return 1.5;
    }
}
