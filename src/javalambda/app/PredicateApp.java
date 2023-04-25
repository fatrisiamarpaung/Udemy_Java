package javalambda.app;

import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {

        //versi anonymous func
        Predicate<String> predicateCheckBlank = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.isBlank();
            }
        };

        System.out.println(predicateCheckBlank.test(""));
        System.out.println(predicateCheckBlank.test("Eko"));

        //versi lambda
        Predicate<String> predicateCheckBlank2 = value -> value.isBlank();

        System.out.println(predicateCheckBlank2.test(""));
        System.out.println(predicateCheckBlank2.test("Eko"));
    }
}
