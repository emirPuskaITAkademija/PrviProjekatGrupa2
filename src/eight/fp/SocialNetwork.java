package eight.fp;

import five.oo.Gender;
import seven.oop.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SocialNetwork {

    public List<Person> loadPersons(){
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
        personList.add(new Person(11111, "Teodora", "Marković", LocalDate.of(2008, 5, 12), Gender.FEMALE));
        personList.add(new Person(22222, "Semra", "Gačanin", LocalDate.of(2012, 2, 12), Gender.FEMALE));
        return personList;
    }

    public List<String> loadPersonNames(){
        return loadPersons().stream().map(Person::getName).collect(Collectors.toList());
    }
}
