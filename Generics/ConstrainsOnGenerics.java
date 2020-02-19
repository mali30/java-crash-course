package company.mohamedali.Generics;

import java.util.ArrayList;
import java.util.List;

/*
We can extend from multiple interfaces by adding the & sign
 */
public class ConstrainsOnGenerics<T extends Number> {
//    private T[] items = (T[]) new Object [10];

    private List<T> itemz =  new ArrayList<T>();

    private int count;

//    public void add(T item){
//        items[count++] = item;
//    }

    public void addItems(T t){
        itemz.add(t);
    }

    public T getItems(T item){
       return itemz.get((Integer)item);
    }

    }
