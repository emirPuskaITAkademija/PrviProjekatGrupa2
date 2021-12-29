package eight;

import five.oo.Gender;
import seven.oop.Box;
import seven.oop.Person;

import java.time.LocalDate;

public class Demo {
    public static void main(String[] args) {
        //TIP ime_varijable = PODATAK;
        //PROSTA VARIJABLA
        char slovo = 'A';
        //TIP ime_varijable = PODACI;
        //SIROVI SLOŽENI TIP PODATAK
        Person person = new Person(1213, "Ena", "Zukanović", LocalDate.of(1999, 1, 1), Gender.FEMALE);
        //TIP ime_varijable = PODACI;
        // PARAMTERIZIRANOM SLOŽENOM TIPU PODATKA
        Box<String> kutija = new Box<String>();
        kutija.setElement("Text");
    }
}
