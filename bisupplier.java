package icsd;

import java.util.function.Supplier;
public class bisupplier {
    public static void main(String[] args) {
        
        // --Example of Supplier

        Supplier<Integer> supplier = () -> 1;
        System.out.println(supplier.get());


        // so we know that every method returns only a single value so there is nothing like biSupplier
    }
}
