package icsd;
import java.util.function.BiPredicate;
public class bipredicates {
    public static void main(String[] args) {

        // ---Bipredicates--

        // Example : 1 

        BiPredicate<Integer, Integer> biPredicate = (x, y) -> x % 2 == 0 && y % 2 == 0;
        System.out.println(biPredicate.test(2, 4));
 
        //Example : 2 

        BiPredicate<String, Integer> biPredicate2 = (str, x) -> str.length() == x;
        System.out.println(biPredicate2.test("Hardik", 10));
    }   
}
