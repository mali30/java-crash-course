package company.mohamedali.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class CollectionsDemo {
    public static void main(String[] args) {
        showDemo();

    }

    public static void showDemo(){
        Collection <String> collection = new ArrayList<>();
        collection.add("Mohamed");
        collection.add("M");
        collection.add("Ali");

        // or you can do this to add at once.
        Collections.addAll(collection, "a","b","c");


        for(var item : collection){
            System.out.println(item);
        }

        System.out.println(collection);
        System.out.println(collection.size());
        System.out.println(collection.remove("a"));
        System.out.println(collection);
        System.out.println(collection.isEmpty());
        System.out.println(collection.contains("a"));

        // convert to object array
        Object [] coll = collection.toArray();
        System.out.println(coll);

        // convert to string array
        String [] strArray = collection.toArray(new String[0]);

        Collection<String> firstColl = new ArrayList<>();
        firstColl.addAll(collection);

        System.out.println(firstColl.equals(collection));












    }
}
