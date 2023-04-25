package javalambda.app;

import java.util.function.Function;

public class FunctionApp {
    public static void main(String[] args) {

        //versi anonymous sederhana
        Function<String, Integer> functionLength = new Function<String, Integer>() {
            @Override
            public Integer apply(String value) {
                return value.length();
            }
        };
        System.out.println(functionLength.apply("Fatrisia"));


        //versi lambda
        Function<String, Integer> functionLength2 = value -> value.length();
        System.out.println(functionLength.apply("Fatrisia"));


    }
}
