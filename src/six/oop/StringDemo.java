package six.oop;

public class StringDemo {
    public static void main(String[] args) {
        String surname1 = "Marković";
        String surname2 = "Marković";
        String surname3 = new String("Marković").intern();
        System.out.println(surname1 == surname2);//true
        System.out.println(surname1 == surname3);//false
    }
}
