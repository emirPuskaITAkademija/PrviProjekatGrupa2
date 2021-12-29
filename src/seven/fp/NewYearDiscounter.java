package seven.fp;

public class NewYearDiscounter implements Discounter{
    @Override
    public double applyDiscount(double amount) {
        double discountedAmount = amount - 0.3*amount;
        return discountedAmount;
    }
}
