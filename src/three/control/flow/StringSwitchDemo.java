package three.control.flow;

import java.util.Scanner;

//1.7 -> switch String
public class StringSwitchDemo {
    public static void main(String[] args) {
        System.out.println("Unesi ime dana na Njemačkom:");
        String weekDayName = new Scanner(System.in).nextLine();
        String uppercCaseName = weekDayName.toUpperCase();
        int weekDayNumber = 0;
        switch (uppercCaseName){
            case "MONTAG":
                weekDayNumber = 1;
                break;
            case "DIENSTAG":
                weekDayNumber = 2;
                break;
            case "MITTWOCH":
                weekDayNumber = 3;
                break;
            case "DONERSTAG":
                weekDayNumber = 4;
                break;
            case "FREITAG":
                weekDayNumber = 5;
                break;
            case "SAMSTAG":
                weekDayNumber = 6;
                break;
            case "SONNTAG":
                weekDayNumber = 7;
                break;
        }
        if(weekDayNumber == 0){
            System.out.println("Žao nam..više sreće drugi put");
        }else{
            System.out.println("Odlično...redni broj unesenog dana na Njemačkom je " + weekDayNumber);
        }
    }
}
