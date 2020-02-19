package company.mohamedali.Generics;

import java.util.Objects;

public class List<T extends Number> {

    private int [] arrList = new int [10];
    private Object[] objarray = new Object[10];
    private int counter = 0;

    public void add(Object value){
        objarray[counter++] = value;
    }

    public Object get(int value){
        return objarray[value];
    }
}
