package exemple1;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MonStream {
    public static void useListOfNumbers() {
        List<Integer> listOfNumbers = List.of(1, 2, 3, 4, 5);
/**
 * Utilisation du takeWhile selon un modulo de 2
 * sur n qui est un élément de listOfNumbers
 * On affiche dans le forEach de façon automatique les valeurs de la liste
 */
        listOfNumbers.stream().filter(n -> n % 2 ==
                0).forEach(System.out::println);
    }
    public static void main(String[] arg){
        useListOfNumbers();
    }
}
