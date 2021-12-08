package three.array;

public class ArrayDemo {
    public static void main(String[] args) {
        /**
         * 1. NAČIN
         */
        //deklaracija niza  null -> složenih tipova podataka
        int[] numberArray;
        //alocirati memoriju za 10 brojeva
        numberArray = new int[10];
        numberArray[0] = 23;
        System.out.println(numberArray[0]);
        System.out.println(numberArray[1]);

        String[] names = new String[2];
        names[0] = "Semra";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names); // toString()
        /*
         2. NAČIN KREIRANJA NIZOVA
         */
        int[] numbers = {23, 13, 123};
        System.out.println(numbers[2]);
       // System.out.println(numbers[3]);
    }
}
