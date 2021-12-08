package two.comparison;

/**
 * <li> && AND</li>
 * <li> || OR</li>
 */
public class ConditionalDemo {
    public static void main(String[] args) {
        int value1 = 1;
        int value2 = 2;
        //Ambigous
//        if ((value1 == 1) && (value2++ == 3)) {
//            System.out.println("value1 is 1 AND value2 is 3");
//        }
        if ((value1 == 3) || (++value2 == 2)) {
            System.out.println("value1 is 1 OR value2 is 2");
        }
        System.out.println("VALUE 2: " + value2);
    }
}
