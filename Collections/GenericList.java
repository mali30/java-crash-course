package company.mohamedali.Collections;

import java.util.Iterator;

// made generic list iterable
public class GenericList<T> implements Iterable<T>{

    //
    private T[] items = (T[]) new Object[10];
    private int count;

    public void addItems(T item){
        items[count++] = item;
    }

    private T get(int item){
        return items[item];
    }

    // return ListIterator which knows how to iterate over a list
    @Override
    public Iterator<T> iterator() {
        return new ListIterator(this);
    }



    private class ListIterator implements Iterator<T>{

        private GenericList<T> list;
        private int index;

        public ListIterator(GenericList<T> mylist){
            this.list = mylist;
        }

        @Override
        public boolean hasNext() {
            return index < list.count;
        }

        @Override
        public T next() {
            return list.items[index++];
        }
    }
}
