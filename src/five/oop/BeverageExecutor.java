package five.oop;

public class BeverageExecutor {
    public static void main(String[] args) {
        int number = 23;
        Esspresso esspresso = new Esspresso();
        Tea tea = new Tea();
        CocaCola cocaCola = new CocaCola();
        MilkDecorator milkDecorator = new MilkDecorator(esspresso);
        consumeBeverage(esspresso);
        consumeBeverage(tea);
        consumeBeverage(cocaCola);
        consumeBeverage(milkDecorator);

        MilkDecorator milkDecorator1 = new MilkDecorator(cocaCola);
        consumeBeverage(milkDecorator1);
    }

    static void consumeBeverage(Beverage beverage){
        System.out.println("Pijem " + beverage.getName()+" i to me košta " + beverage.cost());
    }

//    static void consumeEsspresso(Esspresso esspresso){
//        System.out.println("Pijem " + esspresso.getName()+" i to me košta " + esspresso.cost());
//    }
//
//    static void consumeTea(Tea tea){
//        System.out.println("Pijem " + tea.getName()+" i to me košta " + tea.cost());
//    }
//
//    static void consumeCocaCola(CocaCola cocaCola){
//        System.out.println("Pijem " + cocaCola.getName()+" i to me košta " + cocaCola.cost());
//    }
}
