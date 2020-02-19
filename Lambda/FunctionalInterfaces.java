package company.mohamedali.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {

        // Consumer interface
        // Imperative Programming
        List<Integer> myList = List.of(1,2,3);
        for(var item : myList){
            System.out.println(item);
        }


        // Declarative Programming
        myList.forEach(item  ->System.out.println(item));
        myList.forEach(System.out::println);


        List<String> list = List.of("a","b","c");
        Consumer<String> print = item -> System.out.println(item);
        Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());
        printUpperCase.accept("moe");
        list.forEach(String::toUpperCase);

        var myArrayList = Arrays.asList("Mohamed", "Ali");

        Consumer<List<String>> upperCase = t ->{
            for(int i = 0; i < t.size(); i++){
                t.set(i, t.get(i).toUpperCase());
            }
        };

        Consumer<List<String>> printString =
                t -> t.stream().forEach(System.out::println);



        upperCase.andThen(printString).accept(myArrayList);
        // will print a letter then print the uppercase version of it
        // Chaining Consumers
        list.forEach(print.andThen(printUpperCase));

        Supplier<Double> getRandom = Math::random;
        // lazy evaluation. value not generated until we ask
        var random = getRandom.get();
        System.out.println(random);


        // Function Interface
        // Takes in String paramter and returns na Integer
        Function<String,Integer> map = str -> {
            return str.length();
        };

        var length = map.apply("Mohamed");
        var anotherElement = map.apply("JIM");
        System.out.println(length);


        // Composing Functions
        // This is declarative programming
        Function<String,String> replaceColon = str -> str.replace(":" , "=");
        Function<String,String> addBraces = str -> "{" + str + "}";

        var result = replaceColon
                .andThen(addBraces)
                .apply("key:value");

        // compose chains in reverse order
        result = addBraces.compose(replaceColon).apply("key:value");
        System.out.println(result);

        // Predicate Interface
        // check if word is longer than 5 charactesr

        Predicate<String> isLongerThan5 = str -> str.length() > 5;
        var longerThan5 = isLongerThan5.test("moe");
        System.out.println(longerThan5);

        // CombiningPredicates
        // we have and or not methods
        Predicate<String> hasLeftBrace = str -> str.startsWith("{");
        Predicate<String> hasRightBrace = str -> str.endsWith("}");

        Predicate<String> hasLeftandRight = hasLeftBrace.and(hasRightBrace);
        var resultLeftAndRight = hasLeftandRight.test("{}");
        System.out.println(resultLeftAndRight);


        List<String> myStringList = Arrays.asList("A","B","C","D");
        Predicate<String> getAWords = worsWithA -> worsWithA.startsWith("A");

        myStringList.stream().filter(getAWords).forEach(System.out::println);


        // BinaryOperator Interface

        BinaryOperator<Integer> addMe = (a,b) -> a + b;
        Function<Integer,Integer> squareMe = a -> a * a;

        var addMeAndSquareMe = addMe.andThen(squareMe).apply(1,2);
        System.out.println(addMeAndSquareMe);


        // Unary Operator
        UnaryOperator<Integer> square = n -> n * n;
        UnaryOperator<Integer> increment = n -> n + n;

        var unaryResult = square.andThen(increment).apply(2);
        System.out.println(unaryResult);

        String name = "Mohamed";
        Consumer<String> getFirstchar =
                s -> s.startsWith("M");

    }
}
