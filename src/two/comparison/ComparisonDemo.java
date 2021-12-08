package two.comparison;

import java.util.Scanner;

/**
 * Operatori poređenja:
 * <li>1. == equal to</li>
 * <li>2. != not equal to</li>
 * <li>3. >    </li>
 * <li>4. >= </li>
 * <li>5. <   </li>
 * <li>6. <=   </li>
 */
public class ComparisonDemo {
    public static void main(String[] args) {
        System.out.println("Unesi prvi broj: ");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Unesi drugi broj: ");
        int number2 = new Scanner(System.in).nextInt();
        if(number1 == number2){
            System.out.println("Jednaki brojevi");
        }
        if(number1 != number2){
            System.out.println("Nejednaki brojevi");
        }
        if(number1 > number2){
            System.out.println("Prvi veći od drugog broja");
        }
        if(number1 >= number2){
            System.out.println("Prvi veći ili je jednak drugom broju");
        }
        if(number1 < number2){
            System.out.println("Prvi manji od drugog broja");
        }
        if(number1 <= number2){
            System.out.println("Prvi manji ili je jednak drugom broju");
        }
    }
}
