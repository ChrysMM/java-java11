package exemple3;

import java.util.Map;
import java.util.stream.Stream;

public class MonStream {
    public static void useListOfNumbers() {
        Map<String, String> mapOfString = Map.of("key1", "value1", "key2", "value2");
        /**
         * Affiche d'une map avec sa Key et sa valeur dans un foreach
         */
        System.err.println("mapOfString");
        mapOfString.forEach((key, value) -> System.out.println(key + "-" + value));
        Stream.iterate(2, i -> i < 10, i -> i + 2).forEach(System.out::println);
        Stream.of("a", "b", "c", "d").takeWhile(s -> !s.equals("c")).forEach(System.out::println);
        Stream.of("a", "b", "c", "d").dropWhile(s -> !s.equals("c")).forEach(System.out::println);
    }
    public static void main(String[] arg){
        useListOfNumbers();
    }
}