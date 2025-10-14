package icsd;
import java.util.function.Supplier;

public class Supplier_Interface {  // Changed class name
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> 1;
        System.out.println(supplier.get());
    }
}