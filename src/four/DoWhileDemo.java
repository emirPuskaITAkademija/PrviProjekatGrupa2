package four;

public class DoWhileDemo {
    public static void main(String[] args) {
        //1. Početni korak petlje ili initialization
        int count = 11;
        do {
            System.out.println("Count = " + count);
            count++;//2. Korak petlje ili inkrement
        } while (count < 11);//3. Uslov petlje ili termination
    }
}
