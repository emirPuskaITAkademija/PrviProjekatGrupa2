package four.branching;

import java.util.Random;

public class StringDemo {
    public static void main(String[] args) {
        char slovo = 'X';
        //poziv konstruktora klase String da se kreira varijabla name
        String name = new String("Ena");//.intern()
        //String literal
        String name2 = "Ena";
        String name3 = "Ena";
        System.out.println(name2 == name3);//true ili false -> true
        System.out.println(name == name2); // true ili false -> true
        System.out.println(name2.equals(name3)); // true
        System.out.println(name.equals(name2)); // true
    }
}
