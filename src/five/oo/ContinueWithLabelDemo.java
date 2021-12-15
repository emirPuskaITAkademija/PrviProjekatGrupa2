package five.oo;

/*
ZADAĆA:
Doraditi navedeni primjer ispod i to tako da provjerite ne samo da je riječ sadržana u rečenici.
Potrebno je provjeriti koliko puta se riječ ponavlja u rečenici.
 */
public class ContinueWithLabelDemo {
    public static void main(String[] args) {
        String recenica = "Look for a substring substring substring";
        String rijec = "sub";
        boolean sadrzi = false;
        int duzinaRecenice = recenica.length();
        int duzinaRIjeci = rijec.length();
        int granice = duzinaRecenice - duzinaRIjeci;
        LABELA:
        for (int i = 0; i <= granice; i++) {
            //i = 0
            int k = i;
            for (int j = 0; j < rijec.length(); j++) {
                // i = 0
                // j = 0 , 1  2
                char slovoRecenica = recenica.charAt(k);
                char slovoRijec = rijec.charAt(j);
                if (slovoRecenica != slovoRijec) {
                    continue LABELA;
                }
                k++;
            }
            sadrzi = true;
            break;
        }
        String message = sadrzi ? "Rečenica sadrži riječ" : "Rečenica NE sadrži riječ";
        System.out.println(message);
    }
}
