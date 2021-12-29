package eight;

import eight.fp.PersonDemo;
import five.oo.Gender;
import seven.oop.Person;

import java.time.LocalDate;

public class Demo2 {

    public static void main(String[] args) {
        int number1 = 23;
        int number2 = 34;
        System.out.println("Passing primitive variables to a method");
        swap(number1, number2);
        System.out.println("Number1 = " + number1);//23
        System.out.println("Number2 = " + number2);//34


        System.out.println();
        System.out.println("Passing objects to method");
        Person p1 = new Person().setName("Dino").setSurname("Sporišević").setBirthday(LocalDate.now());
        p1.setGender(Gender.MALE);
        Person p2 = new Person().setName("Bilal").setSurname("Mandžo").setBirthday(LocalDate.now());
        p2.setGender(Gender.MALE);
        swapSurname(p1, p2);
//        swapPerson(p1, p2);
        System.out.println("Person 1 = " + p1);//Sporišević
        System.out.println("Person 2 = " + p2);//Mandžo
    }

    static void swapPerson(Person p1, Person p2){
        Person temp = p1;
        p1 = p2;
        p2 = temp;
        System.out.println("Person 1 = " + p1);//Mandžo
        System.out.println("Person 2 = " + p2);//Sporišević
    }

    static void swapSurname(Person param1, Person param2){
        String temp = param1.getSurname();
        param1.setSurname(param2.getSurname());
        param2.setSurname(temp);
        System.out.println("Person 1 = " + param1);//Mandžo
        System.out.println("Person 2 = " + param2);//Sporišević
    }

    static void swap(int param1, int param2){
        System.out.println("U funkciji ili metodi");
        int temp = param1;
        param1 = param2;
        param2 = temp;
        System.out.println("Number 1 = " + param1);//34
        System.out.println("Number 2 = " + param2);//23
    }
}
