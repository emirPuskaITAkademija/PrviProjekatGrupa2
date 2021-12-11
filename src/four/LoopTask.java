package four;
//CTRL+ALT+L
//CTRL+SHIFT+F
public class LoopTask {
    public static void main(String[] args) {
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 't', 'i', 'n', 'd', 'g'};
        char[] copyTo = new char[8];
        int j = 0;
        for (int i = 2; i < 10; i++) {
            copyTo[j++] = copyFrom[i];
        }
        System.out.println(copyTo);
    }
}
