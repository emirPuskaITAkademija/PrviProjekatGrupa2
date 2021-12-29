package eight.fp;

@FunctionalInterface
public interface ElementTester<E> {
    boolean test(E element);
}
