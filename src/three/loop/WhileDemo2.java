package three.loop;

import java.util.Scanner;

public class WhileDemo2 {
    public static void main(String[] args) {
        boolean unesenaPetica = false;
        while (!unesenaPetica){
            System.out.println("Unesi peticu i započni igricu:");
            int uneseniBroj = new Scanner(System.in).nextInt();
            if(uneseniBroj == 5){
                unesenaPetica = true;
            }
        }
    }
}
