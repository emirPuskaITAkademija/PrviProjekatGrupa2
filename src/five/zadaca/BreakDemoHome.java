package five.zadaca;

import java.util.Random;
import java.util.Scanner;

public class BreakDemoHome {
    public static void main(String[] args) {
        Random numberGenerator = new Random();
        int[] numbers = new int[8];
        for (int i = 0; i < numbers.length; i++) {
            int slucajanBroj = numberGenerator.nextInt(100);
            numbers[i] = slucajanBroj;
        }
        System.out.println("Unesite broj od 0 do 99  i okušajte sreću:");
        int uneseniBroj = new Scanner(System.in).nextInt();
        boolean foundIt = false;
        for (int number: numbers) {
            if (uneseniBroj == number) {
                foundIt = true;
                break;
            }
        }
        String message = foundIt ? "Super sretna korisnik" : "Žao nam je. Pokušajte ponovo";
        System.out.println(message);
    }
}
