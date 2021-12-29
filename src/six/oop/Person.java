package six.oop;

/**
 * Klasa može imati:
 * <li>1. polja ili atribute ili properties</li>
 * <li>2. konstruktor</li>
 * <li>3. metode ili funkcije</li>
 */
class Person {
    private String name;
    private String surname;
    private int age;


    public Person(String name, String surname) {
      this(name, surname, 13);
    }

    public Person(String name, int age) {
        this(name, "", age);
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
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

    public void print() {
        System.out.println(name + " " + surname + " , " + age);
    }

    public void print(String middleName) {
        System.out.println(name + " " + middleName + " " + surname + " , " + age);
    }
}
