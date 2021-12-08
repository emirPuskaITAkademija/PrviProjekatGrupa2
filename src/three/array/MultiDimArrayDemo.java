package three.array;

public class MultiDimArrayDemo {
    public static void main(String[] args) {
        char slovo = 'a';
        String name = "Ena";
        String[][] names1 = new String[2][3];
        names1[0][0] = "Mr.";
        names1[0][1] = "Mrs.";
        String[][] names = {
                {"Mr.", "Mrs.", "Ms."},
                {"Smith", "Jones"}
        };
        //2
        //5
        //6
        System.out.println(names.length);
        System.out.println(names[0].length);
        System.out.println(names[1].length);

        String fullName = names[0][1]+ " " + names[1][1];
        System.out.println(fullName);
        String full = names[0][0]+" " + names[1][0];
        System.out.println(full);





    }
}
