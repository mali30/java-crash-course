package company.mohamedali.Set;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        // do not rely on order. set is good for uniqueness only.
        Set<String> set = new HashSet<>();
        set.add("Mohamed");
        set.add("Ali");
        set.add("Ali");
        System.out.println(set);

        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection , "a", "b" , "c" , "d" , "b" , "a");
        Set<String> sortedList = new HashSet<>(collection);
        System.out.println(sortedList);

        Set<String> set1 = new HashSet<>(Arrays.asList("a","b","c"));
        Set<String> set2 = new HashSet<>(Arrays.asList("b","c","d"));

        // Union - combine two sets and gets rid of duplicates
        set1.addAll(set2);
        System.out.println(set1);

        // intersection - give us items common in both sets
        System.out.println(set1.retainAll(set2));
        System.out.println("intersection " + set1);

        // Difference - whats in one set thats not in another set
        set1.removeAll(set2);
        System.out.println(set1);





    }
}
