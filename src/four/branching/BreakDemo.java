package four.branching;

import java.util.Scanner;

/**
 * Igrica nagradna.
 * Imamo skup brojeva.
 * Korisnik unosi broj.
 * Ukoliko pogodi: nagrada ili utješna rečenica
 */
public class BreakDemo {
    public static void main(String[] args) {
        //ZADAĆA:
        //Svaki član niza numbers generisati tako da bude u opsegu od 0 do 1000 slučajan broj
        //POMOĆ: Random randomGenerator = new Random(1000);
        int[] numbers = {32, 87, 3, 578, 1076, 8, 644, 127};
        System.out.println("Unesi broj i okušaj sreću:");
        int uneseniBroj = new Scanner(System.in).nextInt();
        boolean foundIt = false;
        int i;
        for (i = 0; i < numbers.length; i++) {
            int broj = numbers[i];
            if (uneseniBroj == broj) {
                foundIt = true;
                break;
            }
        }
        String message = foundIt ? "Uneseni broj '" + uneseniBroj + "' se nalazi na indeksu '" + i + "'" : "Više sreće drugi put";
        System.out.println(message);
    }
}
