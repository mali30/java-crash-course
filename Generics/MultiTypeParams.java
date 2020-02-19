package company.mohamedali.Generics;

public class MultiTypeParams {

    // method with multiple types
    public static <K,V> void printMe (K item, V value){
        System.out.println(item + "==" + value);
    }

    public static void main(String[] args) {
        printMe("Age" , 25);
    }

    public static class MultiType<K,V>{
        K key;
        V value;

        public MultiType(K key, V value){
            this.key = key;
            this.value = value;
        }
    }
}
