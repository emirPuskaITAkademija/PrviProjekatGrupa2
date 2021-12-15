package five.oo;

/**
 * Da li Person ima Gender ?
 * DA
 * Da li Gender ima Person ?
 * NE
 */
public class Person {
    private int id;
    private String name;
    private String surname;
    private int age;
    private Gender gender;

    public Person(){

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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public static void print(){

    }
}
