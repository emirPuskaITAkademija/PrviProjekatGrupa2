package four.branching;

import java.util.Random;

public class HelpDemo {
    public static void main(String[] args) {
        int[] numbers = new int[7];
        Random randomGenerator = new Random();
//        for(){
//            //slucajn broj će biti u opsegu od 0--999
//            int slucajnBroj = randomGenerator.nextInt(10000);
//        }
        System.out.println(randomGenerator.nextInt(1000));
    }
}
