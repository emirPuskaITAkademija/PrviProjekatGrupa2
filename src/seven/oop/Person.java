package seven.oop;

import five.oo.Gender;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Person implements Comparable<Person> {
    private int id;
    private String name;
    private String surname;
    private LocalDate birthday;
    private Gender gender;

    public Person() {
    }

    public Person(int id, String name, String surname, LocalDate birthday, Gender gender) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Person setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public Person setBirthday(LocalDate birthday) {
        this.birthday = birthday;
        return this;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getAge() {
        LocalDate now = LocalDate.now();
        Period period = birthday.until(now);
        return period.getYears();
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return name + " " + surname+", age = " + getAge()+", spol: " + gender.getName();
    }

    @Override
    public int hashCode(){
        int hashValue = Objects.hash(id, name, surname, birthday, gender);
        return hashValue;
    }


    @Override
    public boolean equals(Object object){
        if(!(object instanceof Person)){
            return false;
        }
        Person comparedPerson = (Person) object;
        return id == comparedPerson.getId()
                && name.equals(comparedPerson.getName())
                && surname.equals(comparedPerson.getSurname())
                && gender.equals(comparedPerson.getGender())
                && birthday.equals(comparedPerson.getBirthday());
    }

    // p1.compareTo(p2);
    // -1 ako je p1 manje od p2
    // 0 ako su p1 i p2 jednaki
    // 1 ako je p1 veći od p2
    @Override
    public int compareTo(Person anotherPerson) {
        int result = name.compareTo(anotherPerson.getName());
        if(result == 0){
            result = surname.compareTo(anotherPerson.getSurname());
        }
        if(result == 0){
            result = birthday.compareTo(anotherPerson.getBirthday());
        }
        if(result == 0){
            if(id == anotherPerson.getId()){
                result = 0;
            }else if(id< anotherPerson.getId()){
                result = -1;
            }else{
                result = 1;
            }
        }
        return result;
    }
}
