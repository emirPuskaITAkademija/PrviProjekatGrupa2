package five.oop;

public class Tea extends Beverage{
    public Tea() {
        super("Tea");
    }

    @Override
    public double cost() {
        return 2.0;
    }
}
