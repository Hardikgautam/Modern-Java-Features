package icsd;

import java.util.function.BiFunction;

public class bifunction {
    public static void main(String[] args) {
        BiFunction<String, String, Integer> bifunction = (x, y) -> x.length() + y.length();
        System.out.println(bifunction.apply("Hello - ", "Git"));
    }
}
