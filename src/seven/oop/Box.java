package seven.oop;
//Generički tipovi

public class Box<E>{
    private E element;

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }
}
