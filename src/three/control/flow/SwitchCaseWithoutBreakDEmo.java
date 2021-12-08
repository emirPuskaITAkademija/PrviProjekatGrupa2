package three.control.flow;

import java.util.ArrayList;
import java.util.Scanner;

public class SwitchCaseWithoutBreakDEmo {
    public static void main(String[] args) {
        //DINAMIČKI NIZ
        // <String>
        // imenaMjeseci.add(  .. )

        System.out.println("Unesi redni broj dana:");
        int weekDayNumber = new Scanner(System.in).nextInt();
        ArrayList<String> imenaDanaSedmice = new ArrayList<String>();
        switch (weekDayNumber) {
            case 1:
                imenaDanaSedmice.add("Montag");
            case 2:
                imenaDanaSedmice.add("Diennstag");
            case 3:
                imenaDanaSedmice.add("Mittwoch");
            case 4:
                imenaDanaSedmice.add("Donnerstag");
            case 5:
                imenaDanaSedmice.add("Freitag");
            case 6:
                imenaDanaSedmice.add("Samstag");
            case 7:
                imenaDanaSedmice.add("Sonntag");
        }
        imenaDanaSedmice.forEach(System.out::println);
    }
}
