package four.branching;

import java.util.Scanner;

public class BreakWithLabelDemo {
    public static void main(String[] args) {
        /*
        ZADATAK 2: Kao što ste punili pomoću random generatora jednodimenzionalni niz
        tako napunite i ovaj dvodimenzionalni niz.
         */
        /**
         * UPGRADE na ZADATAK 1 i ZADATAK 2.
         * Ne dopustiti unos duplih brojeva.
         * Ako postoji u nizu 23 ne trebate dopustiti ponovno da broj 23 bude u nizu.
         * Izbaciti duplikate.
         */
        int[][] twoDimeArray = {
                {32, 87, 34, 589},
                {818, 1076, 234, 1111},
                {622, 999, 77, 190}
        };
        System.out.println("Unesi broj i okušaj sreću");
        int uneseniBroj = new Scanner(System.in).nextInt();
        boolean foundIt = false;
        //selekt i SHIFT+F6
        lalalalabela: for (int i = 0; i < twoDimeArray.length; i++) {
            int[] element = twoDimeArray[i];
            for(int j = 0; j<element.length; j++){
                int broj = twoDimeArray[i][j];
                if(uneseniBroj == broj){
                    foundIt = true;
                    break lalalalabela;
                }
            }
        }


        String message = foundIt ? "Čestitamo":"Okušajte sreću drugi put";
        System.out.println(message);
    }
}
