package company.mohamedali.Generics;

public class Utils {

    // getting max of integers
    public static int max(int first,int second){
        return Math.max(first, second);
    }

    // getting max of any objects
    // adding generic method to non-generic class
    public static <T extends Comparable<T>> T getMax(T first , T second){
      return (first.compareTo(second) < 0) ? second : first ;
    }


}
