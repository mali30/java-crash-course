package company.mohamedali.Generics;

// storing different types of objects
// <T> -> type of objects we want to store.
public class GenericList<T> {


    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item){
        items[count++] = item;
    }

    public T get(T item){
        return items[count];
    }
}
