package company.mohamedali.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    Class is used to practice ArrayList methods
 */

public class ListDemo {
    public static void main(String[] args) {
        listDemo();

    }

    public static void listDemo(){
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(0,"!");
        Collections.addAll(list,"z");
        list.set(2,"mo");
        list.remove(3);
        int index = list.indexOf("z");
        System.out.println(list.lastIndexOf("mo"));
        System.out.println(list.subList(0,3));
        System.out.println(index);
        System.out.println(list);

    }
}
