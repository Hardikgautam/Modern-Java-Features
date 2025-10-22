package icsd;

//import java.util.function.Function;
import java.util.function.UnaryOperator;

public class unaryoperator {
    public static void main(String[] args) {
        // if the input and the return type is same so we use the UNARY OPERATOR.

        // for-Example : 

        // Function<Integer, Integer> function1 = x -> x * x;
        // Function<String, String> function2 = str -> str.toLowerCase();

        //Example : 1

        UnaryOperator<Integer> unaryOperator = x -> x * x;
        //this understands the input and the output type of the operation is Same.
        System.out.println(unaryOperator.apply(22));
  
        //Example : 2 

        UnaryOperator<String> unaryOperator1 = str -> str.toLowerCase();
        
    }
    
}
