package six.oop;

public class OOPExecutor {
    public static void main(String[] args) {
        int number = 23;
        number = 13;
        int[] numbers = new int[3];
        numbers[0] = 23;
        numbers[1] = 13;
        numbers[2] = 123;

        Person person1 = new Person("Bilal", "Bilky", 23);
        person1.setName("Bilal");
        person1.setSurname("Bilky");
        person1.setAge(24);

        Person person2 = new Person("Teodora", "Marković");

        Person teodora = createPerson("Teodora", 13);
        String name = "Teodora";

    }

    private static Person createPerson(String name, int age) {
        String surname = "Marković";
        Person person = new Person(name, surname, age);
        return person;
    }
}
