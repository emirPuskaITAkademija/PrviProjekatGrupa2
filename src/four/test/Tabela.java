package four.test;

public class Tabela {
    public static void main(String[] args) {
        System.out.println("Vježba - Tablica množenja");
        for (int okvir=0; okvir<25; okvir++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println("#\t\t1\t\t2\t\t3");
        for (int okvir=0; okvir<25; okvir++) {
            System.out.print("*");
        }
        System.out.println();
        int redoslijed;
        int[] tablica1 = {0,1,2,3,4,5,6,7,8,9,10};
        int[] tablica2 = {0,2,4,6,8,10,12,14,16,18,20};
        int[] tablica3 = {0,3,6,9,12,15,18,21,24,27,30};

        for (redoslijed=1; redoslijed<11; redoslijed++) {
            System.out.println(redoslijed + "\t\t" + tablica1[redoslijed] + "\t\t" + tablica2[redoslijed] + "\t\t" + tablica3[redoslijed]);
        }
    }
}
