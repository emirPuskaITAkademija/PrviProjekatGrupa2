package six.oop.design.human;

import five.oo.Gender;
import six.oop.design.animal.Animal;

public class Person {
    private int nin;
    private String name;
    private String middleName;
    private String surname;
    private int age;
    private Gender gender;
    //Depend upon supertype not upon concrete type
    private Animal animal;

    public Person() {
    }


    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }


    public int getNin() {
        return nin;
    }

    public void setNin(int nin) {
        this.nin = nin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
