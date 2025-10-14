package icsd;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class consumer_interface {
    public static void main(String[] args) {
        //predicate -> Boolean valued Function
        // Function -> Operation

        //Consumer:

        // it consumes only there are no return type .

        //example : 1 
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("Keshav");

        //example : 2 
        Consumer<List<Integer>> listConsumer1 = li -> {
            for (Integer i : li) {
                System.out.println(i+100 +"Consumer1");
            }
        };
        Consumer<List<Integer>> listConsumer2 = li -> {
            for (Integer i : li) {
                System.out.println(i+200 +"Consumer2");
            }
        };

        //simply runs 1 
        listConsumer1.accept(Arrays.asList(1, 2, 3, 4, 5));

        // it runs consumer 2 first and then consumer 1 after this 

        listConsumer2.andThen(listConsumer1).accept(Arrays.asList(1,2,3,4,5));


    }
}
