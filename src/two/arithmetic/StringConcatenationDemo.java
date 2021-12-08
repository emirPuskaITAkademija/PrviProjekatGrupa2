package two.arithmetic;

import java.util.Scanner;

public class StringConcatenationDemo {
    public static void main(String[] args) {
        System.out.println("Unesite vaše ime: ");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Unesi i prezime: ");
        String surname = new Scanner(System.in).nextLine();
        String fullName = name + " " + surname;
        System.out.println("Puno ime: " + fullName);
    }
}
