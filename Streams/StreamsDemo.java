package company.mohamedali.Streams;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamsDemo {

    public static void main(String[] args) {
        show();
    }

    public static void show(){
        List<MovieClass> movies = List.of(
        new MovieClass("a", 10),
                new MovieClass("b" , 15),
                new MovieClass("c" , 20)
                );

        // Imperative Programming
        // shows how something should be done
        int counter = 0;
        for(var movie : movies){
            if(movie.getLikes() > 10){
                counter++;
            }
        }

        // Stream - like a pipe used to get data from a collection
        // no instructions just what we want done.
        var moviesGreaterThanTen = movies.stream().filter(movie -> movie.getLikes() > 10).count();
        System.out.println(moviesGreaterThanTen);

        /*
            Streams work on Collections, Arrays, Objects
         */

        Collection<Integer> values = List.of(1,2,3);
        var val = values.stream().filter( m -> m > 0).count();
        System.out.println(val);

        int [] myArr = {1,2,3};
       Arrays.stream(myArr).filter(m -> m > 2).forEach(System.out::println);

       // Infinite stream
//        var randomValues = Stream.generate(() -> Math.random());
//        randomValues.forEach( n -> System.out.println(n));

        // we can limit how many we get back
//        randomValues.limit(10).
//                forEach( n -> System.out.println(n));
//

        // map method
        var anotherListofMovies = List.of(
                new MovieClass("a1" , 10),
                new MovieClass("a2" , 20),
                new MovieClass("a3" , 30)
        );

        anotherListofMovies
                .stream()
                .map(movieClass -> movieClass.getTitle())
                .forEach(System.out::println);

        // flat map
        var moreList = Stream.of(List.of(1,2,3) , List.of(4,5,6));
        moreList.flatMap(list -> list.stream())
                .forEach(System.out::println);


    }
}
