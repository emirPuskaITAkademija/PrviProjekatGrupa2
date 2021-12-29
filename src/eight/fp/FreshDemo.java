package eight.fp;

import seven.oop.Person;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FreshDemo {
    public static void main(String[] args) {
        SocialNetwork socialNetwork = new SocialNetwork();
        List<Person> personList = socialNetwork.loadPersons();
        procesirajElemente(personList,
                p -> true,
                p -> p.getName() + " " + p.getSurname() + " -> " + p.getBirthday(),
                FreshDemo::printElement);
        List<String> personNames = socialNetwork.loadPersonNames();
//        procesirajElemente(
//                personNames,
//                n->n.startsWith("B"),
//                it->it,
//                element -> System.out.println(element)
//        );
    }

    static <T> void printElement(T element){
        System.out.println(element);
    }



    //Kako nad funkcijom uvesti generički tip podatka

    //E -> String
    //A -> String
    static <E, A> void procesirajElemente(List<E> elementi,
                                          Predicate<E> tester,
                                          Function<E, A> transformer,
                                          Consumer<A> consumer) {
        //IMPERATIVE APPROACH
        // testiraj element i odmha ga obradi ako prođe test
//        Iterator<E> elementIterator = elementi.iterator();
//        while (elementIterator.hasNext()) {
//            E element = elementIterator.next();
//            if (tester.test(element)) {
//                A anotherElement = transformer.apply(element);
//                consumer.accept(anotherElement);
//            }
//        }

        //FP style
        elementi.stream().filter(tester).map(transformer).forEach(consumer);
    }
}
