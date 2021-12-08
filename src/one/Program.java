package one;

import javax.swing.*;


public class Program {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "");
        int number1 = 26;
        int number2 = 23;
        byte number3 = 23;
        System.out.println(number3);
        int broj = number3;
        long pravoDugBroj = 234L;
        broj = (int) pravoDugBroj;
        int broj2 = 23;
        System.out.println(broj2);
        broj2 = 34;
        System.out.println(broj);

        float decimalniBroj1 =  23.45F;//64
        double decimalniBroj2 = 23.45;

        char character = '!'; // 32 bit integer  automatsku konverziju u A
        System.out.println(character);//87 W
        //ovo ispod je boolean varijabla
        boolean condition = false;

        int[] numbers = {23, 34, 12};
        int x = 23, y = 13, z = 25;
    }
}
