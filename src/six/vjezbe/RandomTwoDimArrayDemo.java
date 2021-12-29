package six.vjezbe;


import java.util.Random;

public class RandomTwoDimArrayDemo {
    public static void main(String[] args) {
        Random generator = new Random();
        int[][] twoDimArray = new int[3][5];
        for(int i = 0 ; i< twoDimArray.length; i++){
            int[] red = twoDimArray[i];
            for(int j = 0; j<red.length; j++){
                int slucajanBroj = generator.nextInt(100);
                System.out.print(slucajanBroj+"\t");
                twoDimArray[i][j] = slucajanBroj;
            }
            System.out.println();
        }
    }
}
