package company.mohamedali.Generics;

public class Main {

    // generics let us catch errors at compile time
    // vs run time.
    public static void main(String[] args) {
        var list = new List<Number>();
        list.add(1);
        list.add("Mohamed");

        // we specify the type
        var lists = new GenericList<Integer>();
        lists.add(1);
        // error is caught before compiling.

        /*
        To work with primitive types in Generics, we must use their wrapper classes
        int -> Integer
        boolean -> Boolean
        float -> Float
         */
        GenericList<Integer> newGenList = new GenericList<>();
        newGenList.add(1);
//        int aNumber = newGenList.get(0);

        // set a constraint on the generic to only use Numbers and its derivatives
        // (Integer,Float,Double)

//        var testGen = new ConstrainsOnGenerics();
        var numList = new ConstrainsOnGenerics<>();
        numList.addItems(1);
        System.out.println("element -> " + numList.getItems(0));

        // comparable interface

        var user1 = new ComparableUsers(10);
        var user2 = new ComparableUsers(20);

        if(user1.compareTo(user2) < 0){
            System.out.println("user1 < user2");
        }else if(user1.compareTo(user2)  == 0){
            System.out.println("user1 == user2");
        }else{
            System.out.println("user1 > user2");
        }

        // using generic methods
        System.out.println(Utils.getMax("a", "ab"));
        System.out.println(Utils.getMax("25" , "28"));

    }
}
