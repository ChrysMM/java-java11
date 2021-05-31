package exemple2;


import java.util.Set;

public class MonStream {
        public static void useListOfNumbers() {
            Set<Integer> setOfNumbers = Set.of(1, 2, 3, 4, 5);
            /**
             * foreach sur le contenu :
             * setOfNumbers = Set.of(1, 2, 3, 4, 5);
             * avec un test si la value est = 1 alors j'affiche
             * un message comme "titre" : "setOfNumbers"
             * et affiche la value
             */
            setOfNumbers.forEach(value -> {
                if(value == 1) System.err.println("setOfNumbers");
                System.out.println(value);
            });
        }
    public static void main(String[] arg){
        useListOfNumbers();
    }
}


