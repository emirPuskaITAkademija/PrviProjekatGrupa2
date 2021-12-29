package eight.fp;

import seven.oop.Person;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PersonDemo {
    public static void main(String[] args) {
        SocialNetwork socialNetwork = new SocialNetwork();
        List<Person> personList = socialNetwork.loadPersons();
//        printPersonList(personList);
//        printTestablePersonList(personList, p -> true);
//        printPersonsWithGender(personList, Gender.FEMALE);
//        printPersonsWithGender(personList, Gender.MALE);
//        printPersonsWithGender(personList, Gender.UNKNOWN);
//        printTestablePersonList(personList, p->p.getGender().equals(Gender.UNKNOWN));
//        printPersonsOlderThan(personList, 40);
//        printTestablePersonList(personList, p->p.getAge()>=40);
//        printPersonsYoungerThan(personList, 30);
//        printTestablePersonList(personList, p -> p.getAge() < 40);
//        printPersonsYBetweenAges(personList, 30, 40);
//        printTestablePersonList(personList, p-> p.getAge()>=30 && p.getAge()<=40);
//        Stream<Person> personStream = personList.stream();//1. IZVOR STREAMA
//        personStream = personStream.filter(p->p.getAge()>=30 && p.getAge()<=40); //2. MEĐUOPERACIJA
//        personStream.forEach(p-> System.out.println(p));//3. TERMINIRAJUĆA OPERACIJA

//        personList
//                .stream()
//                .filter(p->p.getAge()>=30&&p.getAge()<=40)
//                .forEach(p-> System.out.println(p));
//        Person person = new Person()
//                .setName("Petar")
//                .setSurname("Pan")
//                .setBirthday(LocalDate.of(1900, 1, 1));

  /*      Stream<Person> personStream = personList.stream();//1. IZVOR STREAM
        Predicate<Person> personTest = p -> p.getAge() >= 30 && p.getAge() <= 40;
        personStream = personStream.filter(personTest);//2.1 MEĐUOPERACIJA
        Function<Person, String> transformer = p -> p.getName();
        Stream<String> personNameStream = personStream.map(transformer);//2.2
        Consumer<String> nameConsumer = n -> System.out.println(n);
        personNameStream.forEach(nameConsumer);//3. TERMINIRAMO*/

        //Martin FOwler -> fluentno programiranje
//        personList.stream()
//                .filter(p -> p.getGender().equals(Gender.FEMALE))
//                .map(p -> p.getName() + " " + p.getSurname())
//                .forEach(ns -> System.out.println(ns));


        processTestableElementList(personList, p->true, p->p.getSurname(),  p-> System.out.println(p));
    }

    //personList -> E = Person
    //tester -> E=Person
    //transformer -> E=Person -> R = String
    //consumer -> R = String
    static <E,R> void processTestableElementList(List<E> elementList,
                                           Predicate<E> tester,
                                           Function<E, R> transformer,
                                           Consumer<R> consumer) {
//        elementList.stream().filter(tester).map(transformer).forEach(consumer);
        //1.1, 1.2 , 1.3. 1.4, 1.5, 1.6, 1.7
        //1.8 Spliterator
        //Stream ->
        Iterator<E> personIterator = elementList.iterator();
        while (personIterator.hasNext()) {
            E person = personIterator.next();
            if (tester.test(person)) {
                R anotherElement = transformer.apply(person);
                consumer.accept(anotherElement);
            }
        }

        //Spliterator -> Stream

    }

//    static void printPersonList(List<Person> personList){
//       Iterator<Person> personIterator = personList.iterator();
//       while (personIterator.hasNext()){
//           Person person = personIterator.next();
//           System.out.println(person);
//       }
//    }

//    static void printPersonsWithGender(List<Person> personList, Gender spol){
//        Iterator<Person> personIterator = personList.iterator();
//        while (personIterator.hasNext()){
//            Person person = personIterator.next();
//            if(person.getGender().equals(spol)){
//                System.out.println(person);
//            }
//        }
//    }

//    static void printPersonsOlderThan(List<Person> personList, int age){
//        Iterator<Person> personIterator = personList.iterator();
//        while (personIterator.hasNext()){
//            Person person = personIterator.next();
//            if(person.getAge()>=age){
//                System.out.println(person);
//            }
//
//        }
//    }

//    static void printPersonsYoungerThan(List<Person> personList, int age) {
//        Iterator<Person> personIterator = personList.iterator();
//        while (personIterator.hasNext()) {
//            Person person = personIterator.next();
//            if (person.getAge() < age) {
//                System.out.println(person);
//            }
//
//        }
//    }

//    static void printPersonsYBetweenAges(List<Person> personList, int minAge, int maxAge) {
//        Iterator<Person> personIterator = personList.iterator();
//        while (personIterator.hasNext()) {
//            Person person = personIterator.next();
//            if (person.getAge() >= minAge && person.getAge() <= maxAge) {
//                System.out.println(person);
//            }
//
//        }
//    }

}
