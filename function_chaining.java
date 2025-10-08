package predicates;

import java.util.function.Function;

public class function_chaining {
    public static void main(String[] args) {

        //example : 1
        Function<String, String> function1 =s -> s.toUpperCase();
        Function<String, String> function2 = s ->s.substring(0,3);

        Function<String, String> stringStringfunction = function1.andThen(function2);
        System.out.println( stringStringfunction.apply("Hardik"));

        System.out.println( function1.andThen(function2).apply("Vipul"));


        //example : 2

        Function<Integer, Integer>  function3 = x -> 2*x;
        Function<Integer, Integer> function4 = x -> x*x*x;

        System.out.println(function3.andThen(function4).apply(3)); //216
        System.out.println(function4.andThen(function3).apply(3)); //54

        //using compose method of function

        System.out.println(function3.compose(function4).apply(3));

//        METHOD         SYNTAX                EXECUTION ORDER
//        compose	F.compose(G).apply(x)	First G, then F	F(G(x))
//        andThen	F.andThen(G).apply(x)	First F, then G	G(F(x))



        //using Identity method

        Function<String, String> identityFunction = Function.identity();
        System.out.println(identityFunction.apply("Hardik"));

        // I(x)=x
        //API method requires a Function object as an argument, but you want to pass the data through without any transformation.


    }
    private Object identityFunction(Object s){
        return s;
    }

}