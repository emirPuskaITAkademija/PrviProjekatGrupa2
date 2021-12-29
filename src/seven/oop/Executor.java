package seven.oop;

import five.oo.Gender;

import java.time.LocalDate;

public class Executor {
    public static void main(String[] args) {
        int number = 22;
        number = 23;
        //NIZ
        String[] names = new String[4];
        names[0] = "Ena";
        names[1] = "Edis";
        names[2] = "Semra";
        //KLASA -> polja koja ne moraju biti istog tipa
        LocalDate birthday = LocalDate.of(1999, 12, 23);
        Person person = new Person(12322342, "Ena", "Zukanović", birthday, Gender.FEMALE);
        int age = person.getAge();
        System.out.println("Starost = " + age);

        Person person2 = new Person();
        person2.setName("Edis");
        Box<Integer> kutija = new Box<Integer>();
        kutija.setElement(23);
        Box<String> kutija2 = new Box<>();
        kutija2.setElement("mdskdmk");
    }
}
