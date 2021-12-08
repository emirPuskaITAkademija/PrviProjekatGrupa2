package two.unary;

/**
 * <li>1. + positive numbers</li>
 * <li>2. - negative numbers</li>
 * <li>3. ++  INKREMENT
 *      3.1  POST INKREMENT
 *      3.2 PRE INCREMENT
 * </li>
 * <li>4. -- DECREMENT
 *      4.1 POST DECREMENT
 *      4.2 PRE DECREMENT
 *
 * </li>
 * <li>1. ! LOgical complement invertovanja boolean vrijednosti</li>
 */
public class UnaryDemo {
    public static void main(String[] args) {
        int number = 23;
        System.out.println("Number: " + number);
        number++;//POST INNKREMENT
        System.out.println("Uvećan broj: " + number);//24
        number = 23;
        ++number;//PRE INKREMENT
        System.out.println("Uvećan broj: " + number);//24
        number = 23;
        System.out.println(number++);//1. šalji u konzolu number 2. inkrementiraj joj vrijednost za 1
        System.out.println(number);//24
        number = 23;
        System.out.println(++number);//1.inkrementiraj number 2. šalji number u konzolu
        number = 23;
        System.out.println(number--);//1. šalji number u konzolu 23 2. umanji za 1 ..
        System.out.println(number);
        number = 23;
        System.out.println(--number);//22

        boolean paran = false;
        boolean neparan = !paran;
        System.out.println(neparan);
    }
}
