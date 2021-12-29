package seven.oop;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayDemo {
    public static void main(String[] args) {
        String[] names  = new String[3];
        names[0] = "Ena";
        names[1] = "Semra";
        names[2] = "Edis";
         for(String name: names){
             System.out.println(name);
         }
        System.out.println("ISPIS DINAMIČKE ARRAY LISTE");
        ArrayList<Person> personArrayList = new ArrayList<>();
        ArrayList<String> listOfNames = new ArrayList<>();
        listOfNames.add("Ena");
        listOfNames.add("Semra");
        listOfNames.add("Edis");
        listOfNames.add("Amar");
        listOfNames.add("Faris");
        listOfNames.add("Bojan");

        String edis = listOfNames.get(2);
        System.out.println("Da li je ovo edis: " + edis);
        for(int i = 0; i<listOfNames.size(); i++){
            String name = listOfNames.get(i);
            System.out.println(name);
        }
    }
}
