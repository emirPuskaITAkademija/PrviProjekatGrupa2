package two.comparison;

/**
 * <li> ?   </li>
 *
 *  String result = condition ? "VALUE": "DURIG";
 */
public class ConditionDemo1 {
    public static void main(String[] args) {
        int value1 = 1;
        int value2 = 1;
        boolean condition = value1 == value2;
        String result = value1==value2 ? "JEDNAKI": "NEJEDNAKI";
//        if(condition){
//            result = "Jednaki brojevi";
//        }else{
//            result = "Nejednaki brojevi";
//        }
        System.out.println(result);
    }
}
