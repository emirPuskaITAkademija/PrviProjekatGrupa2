package three.control.flow;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        //switch-case-break
        System.out.println("Unesi redni broj dana:");
        int weekDayNumber = new Scanner(System.in).nextInt();
        String weekDayName;
        switch (weekDayNumber) {
            case 1:
                weekDayName = "Montag";
                break;
            case 2:
                weekDayName = "Diennstag";
                break;
            case 3:
                weekDayName = "Mittwoch";
                break;
            case 4:
                weekDayName = "Donerstag";
                break;
            case 5:
                weekDayName = "Freitag";
                break;
            case 6:
                weekDayName = "Samstag";
                break;
            case 7:
                weekDayName = "Sonntag";
                break;
            default:
                weekDayName = "Unknown";
                break;
        }
        System.out.println("Ime dana na Njemačkom: " + weekDayName);
    }
}
