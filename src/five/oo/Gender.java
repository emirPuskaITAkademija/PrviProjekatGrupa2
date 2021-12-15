package five.oo;

public enum Gender {

    MALE("Muški"),
    FEMALE("Ženski"),
    UNKNOWN("Nešto između");


    private String name;

    private Gender(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
