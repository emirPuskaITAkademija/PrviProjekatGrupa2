package seven.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo {
    public static void main(String[] args) {
        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Ena");
        listOfNames.add("Ena");
        listOfNames.add("Edis");
        listOfNames.add("Bojan");
        listOfNames.add("Bilal");
        for (String name : listOfNames) {
            System.out.println(name);
        }
        System.out.println();
        System.out.println("IDU SETOVI....");
        Set<String> setOfNames = new TreeSet<>();
        setOfNames.add("Ena");
        setOfNames.add("Ena");
        setOfNames.add("Edis");
        setOfNames.add("Bojan");
        setOfNames.add("Bilal");
        for (String name : setOfNames) {
            System.out.println(name);
        }
    }
}
