package three.loop;
//DRY -> Don't Repeat Yourself
public class WhileDemo {
    public static void main(String[] args) {
        //1. initial value setup
        int count = 1;
        //2. uslov petlje
        while(count<11) {
            System.out.println("Counter: " + count);
           count++;
        }
    }
}
