package seven.oop;

import five.oo.Gender;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PersonFactory {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Person ena = new Person(1213, "Ena", "Zukanović", LocalDate.of(1999, 1, 1), Gender.FEMALE);
        personList.add(ena);
        personList.add(ena);
        personList.add(new Person(1213, "Ena", "Zukanović", LocalDate.of(1999, 1, 1), Gender.FEMALE));
        personList.add(new Person(121, "Ena", "Zukanović", LocalDate.of(1999, 1, 1), Gender.FEMALE));
        personList.add(new Person(123, "Edis", "Turković", LocalDate.of(1990, 12, 30), Gender.MALE));
        personList.add(new Person(12, "Amar", "Abadžija", LocalDate.of(2001, 10, 1), Gender.MALE));
        personList.add(new Person(13, "Bilal", "Bilky", LocalDate.of(2009, 8, 12), Gender.MALE));
        personList.add(new Person(113, "Dino", "Mandžo", LocalDate.of(1989, 9, 9), Gender.MALE));
        personList.add(new Person(131, "Nikša", "Bajić", LocalDate.of(1963, 5, 1), Gender.MALE));
        personList.add(new Person(1132, "Emir", "Puška", LocalDate.of(1988, 9, 12), Gender.UNKNOWN));
        for(Person person: personList){
            System.out.println(person);
        }
        System.out.println();
        System.out.println("IDU SETOVI..");
        Set<Person> personSet = new TreeSet<>();
        Person ena2 = new Person(1213, "Ena", "Zukanović", LocalDate.of(1999, 1, 1), Gender.FEMALE);
        personSet.add(ena2);
        personSet.add(ena2);
        personSet.add(new Person(1213, "Ena", "Zukanović", LocalDate.of(1999, 1, 1), Gender.FEMALE));
        personSet.add(new Person(1213, "Ena", "Zukanović", LocalDate.of(1999, 1, 1), Gender.FEMALE));
        personSet.add(new Person(123, "Edis", "Turković", LocalDate.of(1990, 12, 30), Gender.MALE));
        personSet.add(new Person(12, "Amar", "Abadžija", LocalDate.of(2001, 10, 1), Gender.MALE));
        personSet.add(new Person(13, "Bilal", "Bilky", LocalDate.of(2009, 8, 12), Gender.MALE));
        personSet.add(new Person(113, "Dino", "Mandžo", LocalDate.of(1989, 9, 9), Gender.MALE));
        personSet.add(new Person(131, "Nikša", "Bajić", LocalDate.of(1963, 5, 1), Gender.MALE));
        personSet.add(new Person(1132, "Emir", "Puška", LocalDate.of(1988, 9, 12), Gender.UNKNOWN));
        for(Person person: personSet){
            System.out.println(person);
        }
    }
}
