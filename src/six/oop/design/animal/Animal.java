package six.oop.design.animal;

import five.oo.Gender;

public abstract class Animal {
    private int uniqueId;
    private String name;
    private Gender gender;

    public Animal(int uniqueId, String name, Gender gender) {
        this.uniqueId = uniqueId;
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getUniqueId() {
        return uniqueId;
    }

    public abstract void playSound();
}
