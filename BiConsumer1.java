package icsd;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BiConsumer1 {
    public static void main(String[] args) {

        //--------Consume-----------//

        Consumer<Integer> consumer =(x)-> {
            System.out.println(x);
        };
        consumer.accept(28);

        //--BiConsumer--??

        BiConsumer<Integer,Integer> biConsumer =(x,y) -> {
            System.out.println(x+y);
        };

biConsumer.accept(1,3);

    }
}
