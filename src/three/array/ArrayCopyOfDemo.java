package three.array;

import java.util.Arrays;

public class ArrayCopyOfDemo {
    public static void main(String[] args) {
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 't', 'i', 'n', 'd', 'g'};
        char[] copyTo = Arrays.copyOfRange(copyFrom, 2, 10);

        System.out.println(copyTo);
    }
}
